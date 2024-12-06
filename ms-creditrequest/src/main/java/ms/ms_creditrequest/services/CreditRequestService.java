package ms.ms_creditrequest.services;

import ms.ms_creditrequest.entities.CreditRequestEntity;
import ms.ms_creditrequest.entities.MortgageLoanEntity;
import ms.ms_creditrequest.repositories.CreditRequestRepository;
import ms.ms_creditrequest.repositories.MortgageLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CreditRequestService {
    @Autowired
    CreditRequestRepository creditRequestRepository;
    @Autowired
    MortgageLoanRepository mortgageLoanRepository;

    public ArrayList<CreditRequestEntity> getCreditRequests() {
        return (ArrayList<CreditRequestEntity>) creditRequestRepository.findAll();
    }

    public CreditRequestEntity saveCreditRequest(CreditRequestEntity request) {
        return creditRequestRepository.save(request);
    }

    public CreditRequestEntity getCreditRequestByRut(String rut) {
        return creditRequestRepository.findByRut(rut);
    }

    public CreditRequestEntity updateCreditRequest(CreditRequestEntity request) {
        return creditRequestRepository.save(request);
    }

    public boolean deleteCreditRequest(String rut) throws Exception {
        try {
            creditRequestRepository.deleteByRut(rut);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
