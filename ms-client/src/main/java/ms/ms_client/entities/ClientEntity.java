package ms.ms_client.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {

    @Id
    @Column(unique = true, nullable = false)
    private String rut; // Identificador único de cliente (RUT en vez de ID)

    @Column(nullable = false)
    private String firstName; // Primer nombre del cliente
    @Column(nullable = false)
    private String lastName; // Apellido del cliente
    @Column(nullable = false)
    private String email; // Correo electrónico
    @Column(nullable = false)
    private String password; // Clave de acceso
    @Column(nullable = false)
    private String phone; // Teléfono del cliente
    @Column(nullable = false)
    private Double income; // Ingresos del cliente
    @Column(nullable = false)
    private String creditHistory; // Historial crediticio
    @Column(nullable = false)
    private Integer age; // Edad del cliente
    @Column(nullable = false)
    private String employmentType; // Tipo de empleo (Ej. "Empleado", "Independiente")
    @Column(nullable = false)
    private Integer employmentSeniority; // Antigüedad en el empleo (años)
    @Column(nullable = false)
    private String historyStatus; // Estado de historial crediticio
    @Column(nullable = false)
    private Integer pendingDebts; // Cantidad de deudas pendientes

}
