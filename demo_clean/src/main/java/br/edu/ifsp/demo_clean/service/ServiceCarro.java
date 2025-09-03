package br.edu.ifsp.demo_clean.service;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.repository.RepositoryCarro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCarro {

    @Autowired
    private RepositoryCarro carroRepository;


    public Carro cadastrarCarro(Carro novoCarro){
        return carroRepository.save(novoCarro);
    }

    public List<Carro> ListarCarros(){
        return carroRepository.findAll();
    }


}
