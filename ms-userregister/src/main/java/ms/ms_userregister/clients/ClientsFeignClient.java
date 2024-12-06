package ms.ms_userregister.clients.clients;

import ms.ms_creditevaluation.model.ClientEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "ms-client", path= "/clients")
public interface ClientsFeignClient {

    @GetMapping("/{rut}")
    ResponseEntity<ClientEntity> findByRut(@PathVariable String rut);


}
