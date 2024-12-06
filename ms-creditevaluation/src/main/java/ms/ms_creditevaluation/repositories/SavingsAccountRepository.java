package ms.ms_creditevaluation.repositories;

import ms.ms_creditevaluation.entities.SavingsAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccountEntity, Long> {

    // Buscar cuenta de ahorros por RUT
    SavingsAccountEntity findByRut(String rut);
}
