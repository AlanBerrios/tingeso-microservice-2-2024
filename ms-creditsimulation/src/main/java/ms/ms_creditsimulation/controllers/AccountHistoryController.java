package ms.ms_creditsimulation.controllers;

import ms.ms_creditsimulation.entities.AccountHistoryEntity;
import ms.ms_creditsimulation.services.AccountHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account-history")
@CrossOrigin("*")
public class AccountHistoryController {

    private static final Logger logger = LoggerFactory.getLogger(AccountHistoryController.class);

    @Autowired
    private AccountHistoryService accountHistoryService;

    @GetMapping("/{rut}")
    public ResponseEntity<List<AccountHistoryEntity>> getAccountHistoryByRut(@PathVariable String rut) {
        try {
            List<AccountHistoryEntity> history = accountHistoryService.getAccountHistoryByRut(rut);
            return ResponseEntity.ok(history);
        } catch (Exception e) {
            logger.error("Error al obtener el historial de cuentas: ", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping("/")
    public ResponseEntity<?> saveAccountHistory(@RequestBody AccountHistoryEntity history) {
        try {
            // Validación de campos obligatorios
            if (history.getRut() == null || history.getAccountType() == null ||
                    history.getTransactionType() == null || history.getTransactionAmount() == null ||
                    history.getBalanceAfterTransaction() == null || history.getTransactionDate() == null ||
                    history.getTransactionTime() == null) {

                logger.warn("Campos obligatorios faltantes en la transacción: {}", history);
                return ResponseEntity.badRequest().body("Todos los campos requeridos deben estar presentes");
            }

            // Intento de guardar la transacción en la base de datos usando el servicio
            accountHistoryService.saveAccountHistory(history);

            // Respuesta de éxito
            return ResponseEntity.ok("Historial de transacción guardado exitosamente.");

        } catch (Exception e) {
            logger.error("Error al guardar el historial de la cuenta: ", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al guardar el historial de la cuenta: " + e.getMessage());
        }
    }


}
