package br.edu.ifsp.demo_clean.controller;

import br.edu.ifsp.demo_clean.service.ServiceVenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.model.Venda;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/venda")
@Tag(name = "Consumer ", description = "Responsável por gerenciar as vendas da loja.")

public class ControllerVenda {

    @Autowired
    private ServiceVenda serviceVenda;

    public ControllerVenda(ServiceVenda serviceVenda){this.serviceVenda = serviceVenda;}

    @PostMapping("/cadastrar")
    public ResponseEntity<String> salvaVenda(@RequestBody Venda novaVenda){
       Venda vendaCadastrada = serviceVenda.CriarVenda(novaVenda);
       return ResponseEntity.ok("Venda Cadastrada com sucesso! \n " + vendaCadastrada.toString());
    }

    @GetMapping("/listar")
    public ResponseEntity<String> ListarVendas(){
        return ResponseEntity.ok("Vendas listadas com sucesso:  \n" + serviceVenda.ListarVendas());
    }
}