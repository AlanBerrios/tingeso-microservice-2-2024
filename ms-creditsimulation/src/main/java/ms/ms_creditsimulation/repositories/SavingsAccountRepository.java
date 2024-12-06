package ms.ms_creditsimulation.repositories;

import ms.ms_creditsimulation.entities.SavingsAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccountEntity, Long> {

    // Buscar cuenta de ahorros por RUT
    SavingsAccountEntity findByRut(String rut);
}
