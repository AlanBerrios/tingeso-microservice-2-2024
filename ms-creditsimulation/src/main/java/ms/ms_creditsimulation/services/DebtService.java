package ms.ms_creditsimulation.services;

import ms.ms_creditsimulation.entities.DebtEntity;
import ms.ms_creditsimulation.repositories.DebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebtService {

    @Autowired
    private DebtRepository debtRepository;

    // Obtener todas las deudas
    public List<DebtEntity> getAllDebts() {
        return debtRepository.findAll();
    }

    // Obtener deudas por RUT
    public List<DebtEntity> getDebtsByRut(String rut) {
        return debtRepository.findByRut(rut);
    }

    // Guardar nueva deuda
    public DebtEntity saveDebt(DebtEntity debt) {
        return debtRepository.save(debt);
    }

    // Actualizar deuda existente
    public DebtEntity updateDebt(DebtEntity debt) {
        return debtRepository.save(debt);
    }

    // Eliminar deuda por ID
    public boolean deleteDebt(Long id) {
        try {
            debtRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false; // O manejar la excepción según sea necesario
        }
    }
}
