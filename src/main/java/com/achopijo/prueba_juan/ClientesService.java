package com.achopijo.prueba_juan;

import org.springframework.stereotype.Component;

@Component
public class ClientesService implements IClientesService {
    @Override
    public String hola1() {
        return "Hola cliente normal";
    }
}
