package br.com.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ManagerController {

	 @RequestMapping(value = "/{feature}", method = RequestMethod.GET)
     public String load(@PathVariable("feature") String feature, Model model) {         
           return feature;
     }
}
