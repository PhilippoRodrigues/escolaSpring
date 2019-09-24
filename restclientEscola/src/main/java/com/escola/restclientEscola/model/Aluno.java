package com.escola.restclientEscola.model;

import java.io.Serializable;

public class Aluno implements Serializable {

	private int id;
	
	private String nome;
	private String serie; 
	private int faltas;
	
//	private Turma turma;

//	private Turno turno;
	
	// Construtor

	public Aluno() {
	}
	
	public Aluno(int id, String nome, String serie, int faltas) {
		this.nome = nome;
		this.serie = serie;
		this.faltas = faltas;
//		this.turma = turma;
//		this.turno = turno;
	}
	
	
	// Métodos

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

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
//	public void setTurma(Turma turma) {
//		this.turma = turma;
//	}
//
//	public Turma getTurma() {
//		return turma;
//	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
//	public Turno getTurno() {
//		return turno;
//	}
//	
//	public void setTurno(Turno turno) {
//		this.turno = turno;
//	}

	@Override
	public String toString() {
		return "Aluno{ "
				+ "id=" + this.id + 
				",nome=" + this.nome + 
				",serie='" + this.serie + "'" +
				",faltas='" + faltas + "'" +
				//",turma='" + turma + "'" +
				//",periodo='" + turno + "'" + 
				"}";
	}
}
