package com.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escola.model.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer>{
    
}
