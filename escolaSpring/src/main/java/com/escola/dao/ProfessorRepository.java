package com.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escola.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

}
