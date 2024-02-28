package ar.edu.um.tesoreria.factura_sender.controller;

import ar.edu.um.tesoreria.factura_sender.kotlin.model.dto.FacturacionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/facturaSender")
public class FacturaSender {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello FacturaSender");
    }

    @PostMapping("/send")
    public ResponseEntity<FacturacionDto> send(@RequestBody FacturacionDto facturacionDto) {
        return ResponseEntity.ok(facturacionDto);
    }

}
