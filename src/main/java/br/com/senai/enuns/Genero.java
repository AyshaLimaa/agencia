package br.com.senai.enuns;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public enum Genero {
    M("Masculino"), F( "Feminino"), O("Outros");
    private String tipo;
    }
 
