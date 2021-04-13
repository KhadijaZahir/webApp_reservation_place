package org.example.controller;

import org.example.dao.RoleDaoImpl;
import org.example.model.ApprenantEntity;
import org.example.model.RolesEntity;
import org.example.model.UtilisateurEntity;
import org.example.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class registerController {
	@Qualifier("utilisateurService")
	@Autowired
	public UtilisateurService utilisateurService;
	@Autowired
	private RoleDaoImpl roleDao;

	//@RequestMappingis used for mapping web requests onto handler methods in request-handling classes. The process of mapping web requests to handler methods is also called routing
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegister(Model model) {
//		System.out.println("hhiiiii get");
		model.addAttribute("user", new ApprenantEntity());
		return "register";
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public String addUser(ApprenantEntity user) {

		RolesEntity roleEntity = roleDao.getById(2);
		user.setRole(roleEntity);
		user.setReservationnbmax(3);
		utilisateurService.addUser(user);
//		System.out.println(user.getNom());
//		System.out.println("hhiiiii post");
		return "redirect:/";
	}


}
