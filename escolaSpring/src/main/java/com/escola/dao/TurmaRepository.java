/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escola.model.Turma;

//DAO para a entidade Pessoa
//Herda tudo de JpaRepository <Entidade, tipo oo da chave primaria>

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer>{
    
}
