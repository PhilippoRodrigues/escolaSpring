package com.escola.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Disciplina {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@OneToOne(mappedBy="disciplina", cascade = {CascadeType.ALL}, orphanRemoval=true)
	private Professor professor;
	
	//Construtor
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, Professor professor) {
		this.setNome(nome);
		this.setProfessor(professor);
	}

	//Métodos
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Disciplina other = (Disciplina) obj;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		return true;
//	}
	
}
