package com.coderh.clienteapi.cliente.configuracion;

import com.coderh.clienteapi.cliente.entidad.Cliente;
import com.coderh.clienteapi.cliente.repositorio.ClienteRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;

@Configuration
public class ClienteConfiguracion {

    @Bean
    CommandLineRunner commandLineRunner(ClienteRepositorio clienteRepositorio) {
        return args -> {
          clienteRepositorio.save(new Cliente( "Alicia","Garcia", LocalDate.of(2014, 9, 11)));
          clienteRepositorio.save(new Cliente( "Francisco","Garcia", LocalDate.of(2001, Month.JUNE, 21)));
          clienteRepositorio.save(new Cliente( "Lucas","Garcia", LocalDate.of(1999, 7, 1)));
        };
    }
}

