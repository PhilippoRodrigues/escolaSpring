package com.escola.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.escola.dao.ProfessorRepository;
import com.escola.model.Professor;

@Controller
public class ProfessorController {
	
private ProfessorRepository repository;
    
    public ProfessorController(ProfessorRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/usuario/professor")
    public String index(Model model) {
        
        List<Professor> professores = this.repository.findAll();
        
        model.addAttribute("professores", professores);
        return "/professor/professorIndex";
    }
    
    @RequestMapping("/professor/professorInserir")
    public String inserir(Model model){
    	Professor professor = new Professor();
        model.addAttribute("professor", professor);
        return "/professor/professorInserir";
    }
    
    @RequestMapping(value = "/professor/inserirAction", method = RequestMethod.POST)
    public String inserirAction(@ModelAttribute("professor") Professor professor, 
            BindingResult result,
            ModelMap model){
        if(result.hasErrors()){
            return "error";
        }
        
        this.repository.save(professor);
        
        model.addAttribute("professores", this.repository.findAll());
        model.addAttribute("mensagem", "Salvo com sucesso!");
        
        return "/professor/professorIndex";
    }

    @RequestMapping("/professor/alterarProfessor/{id}")
	public String alterar(Model model, @PathVariable(value = "id") int id) {

		Optional<Professor> professor = this.repository.findById(id);
		model.addAttribute("professor", professor.get());
		return "/professor/alterarProfessor";
	}

	@RequestMapping(value = "/professor/alterarAction", method = RequestMethod.POST)
	public String alterarAction(@ModelAttribute("professor") Professor professor, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "error";
		}

		this.repository.save(professor);
		model.addAttribute("mensagem", "Informação modificada");
		model.addAttribute("professores", this.repository.findAll());
		return "/professor/professorIndex";

	}

	@RequestMapping("/professor/removerProfessor/{id}")
	public String remover(Model model, @PathVariable(value = "id") int id) {
		this.repository.deleteById(id);
		model.addAttribute("mensagem", "Informação excluída");
		model.addAttribute("professores", this.repository.findAll());
		return "/professor/professorIndex";
	}
}
