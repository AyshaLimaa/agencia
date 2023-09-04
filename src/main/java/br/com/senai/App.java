package br.com.senai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Cliente;
import br.com.senai.models.Vaga;

public class App {
   public static void main (String[] args){

      Vaga ti = new Vaga();
      ti.setTitulo("Suporte tecnico");
      ti.setNumeroDeVaga(2);
      ti.setDescricao("Devera ter conhecimento em montagem"
      + "manutençao de Computadores");
      ti.setSalario(1900.0);
      ti.setInicioPublicacao(LocalDate.of(2023   , 8, 20));
      ti.setFimPublicacao(LocalDate.of(2023, 9, 4));

      Cliente senai = new Cliente();
      senai.setNome("Senai");
      senai.setResponsavel("Araidna");
      senai.setCpfcnpj("00.003.556/0003-88");

      ti.setCliente(senai);
      Candidato aysha = new Candidato();
      aysha.setNomeCompleto("Aysha Cristina");
      aysha.setDataNascimento(LocalDate.of(2007, 2, 4));
      aysha.setGenero(Genero.F);

      Candidato Camilly = new Candidato();
      Camilly.setNomeCompleto("Camilly Vitoria");
      Camilly.setDataNascimento(LocalDate.of(2006, 8, 23));
      Camilly.setGenero(Genero.F);

      ti.getCandidatos().addAll(Arrays.asList(aysha, Camilly));

      System.out.println("Nome da vaga"+ti.getTitulo()+ "\nSalario:$" + ti.getSalario()+
      "\nInicio:" + ti.getInicioPublicacao() + "\nEntregar ate:" + ti.getFimPublicacao() +
      "\nEmpresa:" + ti.getCliente().getNome());

      for (Candidato candidato: ti.getCandidatos()) {
         System.out.println("Nome:" +candidato.getNomeCompleto());
      }

   }
 }
 
    
 

