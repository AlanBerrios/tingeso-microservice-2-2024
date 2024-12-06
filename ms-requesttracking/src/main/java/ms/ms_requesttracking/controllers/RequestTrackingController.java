package ms.ms_requesttracking.controllers;

import ms.ms_requesttracking.entities.RequestTrackingEntity;
import ms.ms_requesttracking.enums.RequestStatusEnum;
import ms.ms_requesttracking.services.RequestTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request-tracking")
@CrossOrigin("*")
public class RequestTrackingController {

    @Autowired
    RequestTrackingService requestTrackingService;

    @GetMapping("/")
    public ResponseEntity<List<RequestTrackingEntity>> listRequestTracking() {
        List<RequestTrackingEntity> tracking = requestTrackingService.getRequestTracking();
        return ResponseEntity.ok(tracking);
    }

    @GetMapping("/{rut}")
    public ResponseEntity<RequestTrackingEntity> getRequestTrackingByRut(@PathVariable String rut) {
        RequestTrackingEntity tracking = requestTrackingService.getRequestTrackingByRut(rut);
        return ResponseEntity.ok(tracking);
    }

    @PostMapping("/")
    public ResponseEntity<RequestTrackingEntity> saveRequestTracking(@RequestBody RequestTrackingEntity tracking) {
        RequestTrackingEntity newTracking = requestTrackingService.saveRequestTracking(tracking);
        return ResponseEntity.ok(newTracking);
    }

    // Endpoint para actualizar el estado de la solicitud
    @PutMapping("/{rut}")
    public ResponseEntity<RequestTrackingEntity> updateRequestStatus(
            @PathVariable String rut,
            @RequestParam RequestStatusEnum status,
            @RequestParam(required = false) String comments) {

        RequestTrackingEntity updatedTracking = requestTrackingService.updateRequestStatus(rut, status, comments);
        return ResponseEntity.ok(updatedTracking);
    }
}

