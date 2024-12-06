package ms.ms_creditevaluation.services;

import ms.ms_creditevaluation.entities.AccountHistoryEntity;
import ms.ms_creditevaluation.repositories.AccountHistoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountHistoryService {

    private static final Logger logger = LoggerFactory.getLogger(AccountHistoryService.class);

    @Autowired
    private AccountHistoryRepository accountHistoryRepository;

    public List<AccountHistoryEntity> getAccountHistoryByRut(String rut) {
        return accountHistoryRepository.findByRut(rut);
    }

    public void saveAccountHistory(AccountHistoryEntity history) {
        try {
            logger.info("Intentando guardar historial de transacción: {}", history);
            accountHistoryRepository.saveTransactionNativeQuery(
                    history.getRut(),
                    history.getAccountType(),
                    history.getTransactionType(),
                    history.getTransactionAmount(),
                    history.getBalanceAfterTransaction(),
                    history.getTransactionDate(),
                    history.getTransactionTime()
            );
        } catch (Exception e) {
            logger.error("Error al guardar el historial de transacción: ", e);
            throw e;
        }
    }

}
