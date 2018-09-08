package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

	 @RequestMapping(value = "/inicio", method = RequestMethod.POST)
     public String logar(@PathVariable("email") String email, @PathVariable("password") String password, Model model) {         
           
		 if(email.equals("jgm.melo@gmail.com") && password.equals("123")) {
			 return "inicio";
		 }
		 
		 return "login";
     }
}
