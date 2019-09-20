package com.escola.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.dao.AlunoRepository;
import com.escola.model.Aluno;

@RestController
@RequestMapping("/rest/aluno")
public class AlunoRestController {
	
	private AlunoRepository repository;

	public AlunoRestController(AlunoRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<Aluno> list() {
		return this.repository.findAll();
	}

	@GetMapping("/{id}") 
	public Object get(@PathVariable int id) {

		Optional<Aluno> aluno = this.repository.findById(id);
		if (aluno.isPresent()) {
			return new ResponseEntity<>(aluno.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping
	public Aluno post(@RequestBody Aluno aluno) {
		return this.repository.save(aluno);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		Optional<Aluno> aluno = this.repository.findById(id);
		if (aluno.isPresent()) {
			this.repository.delete(aluno.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> put(@PathVariable int id, @RequestBody Aluno novoAluno) {
		Optional<Aluno> alunoAntigo = this.repository.findById(id);
		if (alunoAntigo.isPresent()) {
			novoAluno.setId(id);
			this.repository.save(novoAluno);
			return new ResponseEntity<>(novoAluno, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
