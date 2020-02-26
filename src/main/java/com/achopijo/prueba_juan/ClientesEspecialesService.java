package com.achopijo.prueba_juan;

import org.springframework.stereotype.Component;

@Component
public class ClientesEspecialesService implements IClientesService {
    @Override
    public String hola1() {
        return "Hola cliente especial.";
    }
}
