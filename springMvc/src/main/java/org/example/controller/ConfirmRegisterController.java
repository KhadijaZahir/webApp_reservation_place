package org.example.controller;

import org.example.model.UtilisateurEntity;
import org.example.repositories.AdminRepository;

import org.example.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ConfirmRegisterController {
    @Qualifier("utilisateurService")
    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private AdminRepository adminRepository;

    public UtilisateurEntity user = new UtilisateurEntity();


    @RequestMapping(value = "confirmRegister")
    public String ConfirmRegister(ModelMap modelMap) {
        List<UtilisateurEntity> student = utilisateurService.getAllUsers();
        modelMap.addAttribute("student", student);
        return "administrateur";

    }

    @RequestMapping(value = "/confirmRegister", method = RequestMethod.POST)
    public String showStudents() {
        adminRepository.getUserByRole("student");
        return "redirect:/administrateur";
    }

    @RequestMapping(value = "/confirmer", method = RequestMethod.POST)
    //@RequestParam : annotation used for accessing the query parameter values from the request.
    public String Confirmer(@RequestParam("id") int id) {
        adminRepository.ConfirmerUsersRegister(id);
        return "redirect:/confirmRegister";
    }


}