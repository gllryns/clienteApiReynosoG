package com.coderh.clienteapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ClienteApiApplication {

    public static void main (String[] args){
        SpringApplication.run(ClienteApiApplication.class, args);

    }

    @GetMapping("/")
    public String home() {
        return "<h2>Desafío Cliente API Guillermo Reynoso - Curso Java inicial</h2><a " +
                "href=\"http://localhost:8080/api/v1/clientes/\">Listado de clientes en formato JSON</a>";
    }


}

