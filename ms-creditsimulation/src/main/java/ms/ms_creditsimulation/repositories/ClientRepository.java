package ms.ms_creditsimulation.repositories;

import ms.ms_creditsimulation.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, String> {
    ClientEntity findByRut(String rut);
    void deleteByRut(String rut);
    boolean existsByRut(String rut);

    @Modifying
    @Query(value = "DELETE FROM clients WHERE rut = :rut", nativeQuery = true)
    void deleteByRutNativeQuery(@Param("rut") String rut);

    // Query nativo para encontrar un cliente por su RUT
    @Query(value = "SELECT * FROM clients WHERE clients.rut = :rut", nativeQuery = true)
    ClientEntity findByRutNativeQuery(@Param("rut") String rut);

    List<ClientEntity> findByIncomeGreaterThan(int i);

    List<ClientEntity> findByEmploymentType(String s);
}
