 package br.com.senai.models;

 import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


import br.com.senai.enuns.Genero;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


 public class Candidato  {
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String cpf;
    private String email;
    private Genero genero;
    private String naturalidade;
    private String nacionalidade;
    private Endereco endereco;
    private List<Escolaridade> escolaridades = new ArrayList<>();

    public int calcularidade() {
      return Period.between(this.dataNascimento, 
            LocalDate.now()).getYears();
    }

    public String eMaioridade() {
      return calcularidade() >=18 ? "sim" : "nao";
    }
    public String getNomeCompleto(){
    return nomeCompleto;
 }
    public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
}
public LocalDate getDataNascimento() {
  return dataNascimento;
}
public void setDataNascimento(LocalDate dataNascimento) {
  this.dataNascimento = dataNascimento;
}
 }
 

   