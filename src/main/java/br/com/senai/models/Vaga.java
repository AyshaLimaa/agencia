package br.com.senai.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Vaga {
    private String titulo;
    private String descricao;
    private int numeroDeVaga;
    private Double salario;
    private LocalDate inicioPublicacao;
    private LocalDate fimPublicacao;
    private String imagemPublicacao;
    private boolean publicado;
    private Cliente cliente;
    private List <Candidato> candidatos = new ArrayList<>();

}
