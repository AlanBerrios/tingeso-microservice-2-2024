package ms.ms_creditsimulation.controllers;

import ms.ms_creditsimulation.services.CreditSimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit-simulations")
@CrossOrigin("*")
public class CreditSimulationController {

    @Autowired
    CreditSimulationService creditSimulationService;

    // P1. Simular crédito hipotecario
    @GetMapping("/simulate")
    public ResponseEntity<Double> simulateCredit(
            @RequestParam double principal,
            @RequestParam double annualInterestRate,
            @RequestParam int termInYears) {
        double monthlyPayment = creditSimulationService.simulateCredit(principal, annualInterestRate, termInYears);
        return ResponseEntity.ok(monthlyPayment);
    }
}
