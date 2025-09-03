package br.edu.ifsp.demo_clean.service;

import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.repository.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCliente {

    @Autowired
    private RepositoryCliente clienteRepository;

    public Cliente CadastrarCliente(Cliente Novocliente){
       return clienteRepository.save(Novocliente);
    }

    public List<Cliente> ListarClientes(){
        return clienteRepository.findAll();
    }

}
