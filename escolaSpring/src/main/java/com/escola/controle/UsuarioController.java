package com.escola.controle;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {
	
	@RequestMapping(value = "usuario/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("email") String email,
            @RequestParam("senha") String senha,
            @RequestParam("nome") String nome,
            HttpSession session,
            ModelMap modelMap) {

        if("u@u.com".equalsIgnoreCase(email) && "u".equalsIgnoreCase(senha)){
            session.setAttribute("nome", nome);
            
            return "/template/menu";
        }else{
            return "redirect:../?mensagem="+"Usuário ou senha inválido";
        }
        
    }
}
