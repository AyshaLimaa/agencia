package br.com.senai.models;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Escolaridade {
    private String nomeInstituicao;
    private String nomeCurso;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean concluido;
    
}
