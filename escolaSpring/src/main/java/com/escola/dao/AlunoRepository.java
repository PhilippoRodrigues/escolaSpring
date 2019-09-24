package com.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escola.model.Aluno;

//DAO para a entidade Pessoa
//Herda tudo de JpaRepository <Entidade, tipo oo da chave primaria>

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
