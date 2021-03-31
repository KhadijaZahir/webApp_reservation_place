package org.example.controller;

import org.example.dao.UtilisateurDaoImpl;
import org.example.model.ApprenantEntity;
import org.example.model.UtilisateurEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class register {
	
	//Display Regestre

		@RequestMapping(value="register")
		public String ShowRegistre(@ModelAttribute("student") ApprenantEntity apprenantEntity)
		{
			return "register";
		}

}
