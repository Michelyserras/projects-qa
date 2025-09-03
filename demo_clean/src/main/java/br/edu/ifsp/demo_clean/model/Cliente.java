package br.edu.ifsp.demo_clean.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idCliente;

    public String nomeCliente;

    @OneToMany(mappedBy="cliente")
    public List<Carro> carrosCliente = new ArrayList<>();

    public Cliente(){}
    public Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", carrosCliente=" + carrosCliente +
                '}';
    }
}
