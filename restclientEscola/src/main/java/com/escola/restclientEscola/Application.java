package com.escola.restclientEscola;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.escola.restclientEscola.model.Aluno;
import com.escola.restclientEscola.service.RestService;

@SpringBootApplication
public class Application implements CommandLineRunner{
    
    private RestService restService;
    
    public Application(RestService restService){
        this.restService = restService;
    }
    
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        String uri = "http://localhost:8080/rest/aluno";
        
        String json = restService.getAsJson(uri);
        System.err.println(json);
        
        Class al = Aluno[].class;
        Object retorno = restService.get(uri, al);
        Aluno[] alunos = (Aluno[]) retorno;
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
        
        System.out.println();
        
        int id = 4;
        Class alGet = Aluno.class;
        Object retornoGet = restService.get(uri, alGet, id);
        Aluno retornarAluno = (Aluno) retornoGet;
        System.out.println("ID do aluno: " + retornarAluno.getId());
        
        System.out.println();
        
        Aluno novoPost = new Aluno(19, "Victor", "1º ano - ensino médio", 30);
        Aluno novoAluno = (Aluno) restService.post(uri, novoPost);
        System.out.println("Introdução de dados de aluno novo: " + novoAluno.getNome());
        
        System.out.println();
        
        
        int idPut = 4;
        Aluno alterarAluno = new Aluno(4, "Beatriz", "1º ano - ensino médio", 30);
        Aluno retornoAlterar = (Aluno) restService.put(uri, alterarAluno, id);
        System.out.println("Alteração dos dados de aluno no sistema: " + retornoAlterar.getNome());
        
        System.out.println();
        
        //Tem que mudar o id, pois o id 17 já está deletado
        
        restService.delete(uri, 17);
    }
}
