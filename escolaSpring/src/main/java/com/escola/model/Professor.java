package com.escola.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Professor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Disciplina disciplina;
	
	//Construtor 
	
	public Professor() {
		
	}
	
	public Professor(String nome, Disciplina disciplina) {
		this.setNome(nome);
		this.setDisciplina(disciplina);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
		disciplina.setProfessor(this);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Professor(a): %s - Disciplina: %s",
							this.getNome(),
							disciplina.getNome());
	}
	
}
