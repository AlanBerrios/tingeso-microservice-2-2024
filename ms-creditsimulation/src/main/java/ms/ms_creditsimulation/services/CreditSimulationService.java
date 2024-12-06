package ms.ms_creditsimulation.services;

import org.springframework.stereotype.Service;

@Service
public class CreditSimulationService {

    // P1 Simulacion del credito hipotecario ------------------
    // Método para simular el crédito
    public double simulateCredit(double principal, double annualInterestRate, int termInYears) {
        // Convertir la tasa de interés anual a mensual y a porcentaje
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        // Calcular el número total de pagos (plazo en años * 12)
        int totalPayments = termInYears * 12;

        // Calcular la cuota mensual usando la fórmula
        // Principal es el monto del prestamo
        double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        return Math.round(monthlyPayment); // Retornar la cuota mensual calculada
    }
}
