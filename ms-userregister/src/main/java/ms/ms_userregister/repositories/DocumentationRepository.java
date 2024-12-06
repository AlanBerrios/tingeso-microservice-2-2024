package ms.ms_userregister.repositories;

import ms.ms_userregister.entities.DocumentationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentationRepository extends JpaRepository<DocumentationEntity, String> {

    // Buscar documentación por RUT
    DocumentationEntity findByRut(String rut);

    // Eliminar documentación por RUT
    void deleteByRut(String rut);
}
