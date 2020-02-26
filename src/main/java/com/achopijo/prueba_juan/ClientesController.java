package com.achopijo.prueba_juan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientesController {
    final ClientesService clientesService;
    final ClientesEspecialesService clientesEspecialesService;
    List<Double> nota = new ArrayList<>();

    public ClientesController(ClientesEspecialesService clientesEspecialesService, ClientesService clientesService) {
        this.clientesEspecialesService = clientesEspecialesService;
        this.clientesService = clientesService;
    }

    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "true") boolean esEspecial) {
        if (esEspecial) {
            return clientesEspecialesService.hola1();
        } else {
            return clientesService.hola1();
        }
    }
}
