package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	 @RequestMapping(value = "/load", method = RequestMethod.GET)
     public String load(Model model) {         
           return null;
     }
}
