package br.edu.ifsp.demo_clean.service;


import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.repository.RepositoryVenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVenda {

    @Autowired
    private RepositoryVenda repositoryVenda;

    public Venda CriarVenda(Venda venda) {
       return repositoryVenda.save(venda);
    }

    public List<Venda> ListarVendas(){
        return repositoryVenda.findAll();
    }
}
