package br.edu.ifsp.demo_clean.controller;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.service.ServiceCarro;
import br.edu.ifsp.demo_clean.service.ServiceCliente;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/carro")
@Tag(name = "Carros ", description = "Responsável por gerenciar os carros cadastrados")
public class ControllerCarro {

    @Autowired
    private ServiceCarro serviceCarro;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> SalvarCarro(@RequestBody Carro novoCarro){
        Carro carroCadastrado = serviceCarro.cadastrarCarro(novoCarro);
        return ResponseEntity.ok().body("Carro cadastrado com sucesso: \n " +  carroCadastrado.toString());
    }

    @GetMapping("/listar")
    public ResponseEntity<String> ListarCarros(){
        return ResponseEntity.ok("Carros listados com sucesso: \n" + serviceCarro.ListarCarros());
    }

}
