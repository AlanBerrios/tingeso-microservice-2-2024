package ms.ms_totalcost.services;

import org.springframework.stereotype.Service;
@Service
public class LoanCostService {

    // Método para calcular la cuota mensual usando la fórmula
    public double calculateMonthlyPayment(double principal, double annualInterestRate, int termInYears) {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = termInYears * 12;

        double result = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return Math.round(result); // Redondear a la unidad más cercana
    }

    // Método para calcular el seguro de desgravamen
    public double calculateInsurance(double principal, double lifeInsuranceRate) {
        return Math.round(principal * lifeInsuranceRate);
    }

    // Método para calcular la comisión por administración
    public double calculateAdminFee(double principal, double adminFeeRate) {
        return Math.round(principal * adminFeeRate); // Porcentaje de la cuota de administración
    }

    // Método para calcular el costo total (sin incluir la comisión)
    public double calculateMonthlyPayment(double principal, double annualInterestRate, int termInYears, double lifeInsuranceRate, double fireInsuranceMont) {
            double montlyPayment = calculateMonthlyPayment(principal, annualInterestRate, termInYears);
            double insurance = calculateInsurance(principal, lifeInsuranceRate);
            double totalMonthlyCost = montlyPayment + insurance + fireInsuranceMont;
            return Math.round(totalMonthlyCost);
    }

    // Método principal que combina todos los cálculos
    public double calculateTotalLoanPayment(double principal, int termInYears, double adminFeeRate, double monthlyPayment) {
            double adminFee = calculateAdminFee(principal, adminFeeRate);
            double totalLoanPayment = monthlyPayment * (termInYears * 12);
            return Math.round(totalLoanPayment + adminFee);
    }
}

