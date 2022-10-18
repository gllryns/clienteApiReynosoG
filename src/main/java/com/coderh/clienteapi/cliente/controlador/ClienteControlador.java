package com.coderh.clienteapi.cliente.controlador;

import com.coderh.clienteapi.cliente.entidad.Cliente;
import com.coderh.clienteapi.cliente.servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/")
class ClienteControlador {

    private final ClienteServicio clienteServicio;

    @Autowired
    public ClienteControlador(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }


    @GetMapping("/clientes/")
    public List<Cliente> getClientes() {
        return clienteServicio.getClientes();
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> getCliente(@PathVariable("id") Long id) {
        return clienteServicio.getCliente(id);
    }
    }
