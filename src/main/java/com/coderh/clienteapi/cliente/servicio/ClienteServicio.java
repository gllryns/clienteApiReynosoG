package com.coderh.clienteapi.cliente.servicio;

import com.coderh.clienteapi.cliente.entidad.Cliente;
import com.coderh.clienteapi.cliente.repositorio.ClienteRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {

    private final ClienteRepositorio clienteRepositorio;

    public ClienteServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public List<Cliente> getClientes() {
        return clienteRepositorio.findAll();
    }

    public Optional<Cliente> getCliente(Long id) {
        return clienteRepositorio.findById(id);
    }



}


