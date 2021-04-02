package org.example.controller;

import org.example.dao.RoleDaoImpl;
import org.example.model.ApprenantEntity;
import org.example.model.RolesEntity;
import org.example.model.UtilisateurEntity;
import org.example.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class studentController {
//    @Qualifier("utilisateurService")
//    @Autowired
//    public UtilisateurService utilisateurService;
//    @Autowired
//    private RoleDaoImpl roleDao;
//
//
//    @RequestMapping(value = "/registerProcess", method = RequestMethod.GET)
//    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
//                                @ModelAttribute("user") UtilisateurEntity user) {
//
//        RolesEntity roleEntity = roleDao.getById(2);
//        user.setRole(roleEntity);
////		user.setReservationnbmax(user.getReservationnbmax());
//       utilisateurService.getAllUsers().user.getRole().getRoleName().equals("student");
//        user.getRole().getRoleName().equals("student");
//        System.out.println(user.getNom());
//
//        return new ModelAndView("apprenant", "nom", user.getNom());
//    }

}
