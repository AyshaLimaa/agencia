package br.com.senai.models;
import br.com.senai.enuns.Estado;
import lombok.Getter;
import lombok.Setter;

public class Endereco {
  @Getter
  @Setter
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private Estado estado;
 }
    

