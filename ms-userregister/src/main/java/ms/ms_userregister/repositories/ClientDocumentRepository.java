// ClientDocumentRepository.java
package ms.ms_userregister.repositories;

import ms.ms_userregister.entities.ClientDocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClientDocumentRepository extends JpaRepository<ClientDocumentEntity, Long> {
    List<ClientDocumentEntity> findByClientRut(String clientRut);
}
