package br.com.senai;


import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;


import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade;

public class App 
{
    public static void main( String[] args ){
        
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        Candidato aysha = new Candidato();
        aysha.nomeCompleto = "aysha Cristina Ramos Lima";
        aysha.dataNascimento = LocalDate.of(2000, 10, 16);
        aysha.email = "ayshaLima@gmail.com";
        aysha.genero = Genero.F;
        aysha.naturalidade = Estado.PI.toString();
        aysha.nacionalidade = "Brasil";
        aysha.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema para Internet";
        e1.nomeInstituicao = "Senai";
        e1.dataInicio = LocalDate.of(2022, 10, 01);
        e1.dataFim = LocalDate.of(2023, 06, 10);

        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Engenharia Civil";
        e2.nomeInstituicao = "IFPI - Inst. Federal do Piauí";
        e2.dataInicio = LocalDate.of(2020, 02, 01);
        e2.dataFim = LocalDate.of(2023, 06, 10);
        
        Candidato camilly = new Candidato();
        camilly.nomeCompleto = "Camilly vitoria";
        camilly.dataNascimento = LocalDate.of(2006, 8, 23);
        camilly.email = "camillyLopes@gmail.com";

        // List<Escolaridade> list = new ArrayList<>();
        // list.add(e1);
        // list.add(e2);

        aysha.escolaridades = Arrays.asList(e1,e2);

        System.out.println("Nome Completo "+aysha.nomeCompleto);
        System.out.println("Idade: "+ (aysha.calcularidade()));
        System.out.println("Endereço:" + aysha.endereco.logradouro);

        for (Escolaridade escolaridade : aysha.escolaridades) {
            System.out.println(escolaridade.nomeCurso+" - "+escolaridade.nomeInstituicao);
        
        
        System.out.println("Nome Completo "+aysha.nomeCompleto);
        System.out.println("Maior de Idade "+ (aysha.eMaioridade()));

        System.out.println("***********************************");
        System.out.println("Nome Completo "+camilly.nomeCompleto);
        System.out.println("Maior de Idade: "+ (camilly.eMaioridade()));

      
        }
        }
    }


