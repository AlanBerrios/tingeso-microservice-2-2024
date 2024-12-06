package ms.ms_userregister.repositories;

import ms.ms_userregister.entities.JobsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobsRepository extends JpaRepository<JobsEntity, String> {

    // Buscar trabajos por RUT
    List<JobsEntity> findByRut(String rut);

    // Eliminar trabajo por RUT
    void deleteByRut(String rut);
}
