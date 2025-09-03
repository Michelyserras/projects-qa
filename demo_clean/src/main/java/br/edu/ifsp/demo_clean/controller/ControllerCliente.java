package br.edu.ifsp.demo_clean.controller;

import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.service.ServiceCliente;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/cliente")
@Tag(name = "Clientes ", description = "Responsável por gerenciar os clientes cadastrados")
public class ControllerCliente {

    @Autowired
    private ServiceCliente serviceCliente;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> SalvarCliente(@RequestBody Cliente novoCliente){
        Cliente clienteCadastrado = serviceCliente.CadastrarCliente(novoCliente);
        return ResponseEntity.ok().body("Cliente cadastrado com sucesso: " + clienteCadastrado.toString() );
    }

    @GetMapping("/listar")
    public ResponseEntity<String> ListarClientes(){
        return ResponseEntity.ok("Clientes listados com sucesso: \n" + serviceCliente.ListarClientes());
    }

}
