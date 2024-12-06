package ms.ms_creditevaluation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {

    private String rut; // Identificador único de cliente (RUT en vez de ID)
    private String firstName; // Primer nombre del cliente
    private String lastName; // Apellido del cliente
    private String email; // Correo electrónico
    private String password; // Clave de acceso
    private String phone; // Teléfono del cliente
    private Double income; // Ingresos del cliente
    private String creditHistory; // Historial crediticio
    private Integer age; // Edad del cliente
    private String employmentType; // Tipo de empleo (Ej. "Empleado", "Independiente")
    private Integer employmentSeniority; // Antigüedad en el empleo (años)
    private String historyStatus; // Estado de historial crediticio
    private Integer pendingDebts; // Cantidad de deudas pendientes

}
