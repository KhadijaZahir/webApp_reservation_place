package org.example.controller;

import org.example.dao.RoleDaoImpl;
import org.example.model.ApprenantEntity;
import org.example.model.RolesEntity;
import org.example.model.UtilisateurEntity;
import org.example.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class register {
	@Qualifier("utilisateurService")
	@Autowired
	public UtilisateurService utilisateurService;
	@Autowired
	private RoleDaoImpl roleDao;




	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("hhiiiii get");

		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new ApprenantEntity());


		return mav;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
								@ModelAttribute("user") ApprenantEntity user) {

		RolesEntity roleEntity = roleDao.getById(2);
		user.setRole(roleEntity);
//		user.setReservationnbmax(user.getReservationnbmax());
		user.setReservationnbmax(25);
		utilisateurService.addUser(user);
		System.out.println(user.getNom());
		System.out.println("hhiiiii post");

		return new ModelAndView("apprenant", "nom", user.getNom());
	}


	//	@RequestMapping(value="register")
//	public String DisplayRegestre(@ModelAttribute("student") ApprenantEntity apprenantEntity)
//	{
//		return "register";
//	}
//
//
//
//	@RequestMapping(value = "registerProcess", method = RequestMethod.POST)
//	public String register(HttpServletRequest request, @ModelAttribute("student") ApprenantEntity apprenantEntity){
//
//			RolesEntity roleEntity = roleDao.getById(2);
//			apprenantEntity.setRole(roleEntity);
//		     utilisateurService.addUser(apprenantEntity);
//			 return "redirect:/apprenant";
//	}


}
