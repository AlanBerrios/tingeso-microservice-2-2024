package ms.ms_creditsimulation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "credit_evaluations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditEvaluationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rut; // Identificador único de cliente (RUT en vez de ID)

    private Double paymentToIncomeRatio; // Relación cuota/ingreso en porcentaje
    private String creditHistory; // Resultado de la revisión del historial crediticio
    private Integer employmentSeniority; // Antigüedad laboral (años)
    private Double debtToIncomeRatio; // Relación deuda/ingreso en porcentaje
    private Boolean savingsCapacity; // Indica si tiene capacidad de ahorro
    private String evaluationResult; // Resultado de la evaluación (Ej. "Aprobado", "Rechazado")
    private LocalDate evaluationDate; // Fecha en la que se realizó la evaluación
}
