package org.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.example.dao.ReservationDaoImpl;
import org.example.dao.UtilisateurDao;
import org.example.dao.UtilisateurDaoImpl;
import org.example.model.UtilisateurEntity;
import org.example.repositories.LoginRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")

public class LoginController {

	@Autowired
	private UtilisateurDao userDao;

	@RequestMapping(value = "/")
	public String Login() {
		return "login";
	}

	@RequestMapping(value = "/Account", method = RequestMethod.POST)
	public String account(HttpServletRequest req,ModelMap modelMap) {
		
	  UtilisateurEntity user = new UtilisateurEntity();
		LoginRepostory userRep=new LoginRepostory();
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		user = userRep.getUserByEmail(email);
		if (user.getPassword().equals(pass)) {
			
			if(user.getRole().getRoleName().equals("admin")) {
				return "administrateur";
				
			}
			else if (user.getRole().getRoleName().equals("student")) {
				return "apprenant";
			}
			
		} else {
			return "login";
		}
		
		return "login";

	}

}







