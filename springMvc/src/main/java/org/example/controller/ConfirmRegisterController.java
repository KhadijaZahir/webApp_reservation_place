package org.example.controller;

import org.example.dao.TypeReservationDao;
import org.example.dao.TypeReservationDaoImpl;
import org.example.model.ApprenantEntity;
import org.example.model.ReservationEntity;
import org.example.model.TypereservationEntity;
import org.example.model.UtilisateurEntity;
import org.example.repositories.AdminRepository;
import org.example.repositories.ReservationRepository;
import org.example.service.ReservationService;
import org.example.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
    public String histReservation(ModelMap modelMap ) {
        List<UtilisateurEntity> student = utilisateurService.getAllUsers();
        modelMap.addAttribute("student", student);
        return "administrateur";

    }

    @RequestMapping(value = "/confirmRegister", method = RequestMethod.POST)
    public String historicReservation(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("hhiiiii confirmRegister");
        adminRepository.getUserByRole("student");
        return "redirect:/administrateur";
    }

        @RequestMapping(value = "/confirmer", method = RequestMethod.POST)
    public String Confirmer(@RequestParam("id") int id) {
            adminRepository.ConfirmerUsersRegister(id);
        return "redirect:/administrateur";
    }
//    @RequestMapping(value = "/rejeter", method = RequestMethod.POST)
//    public String rejeter(@RequestParam("id") int id) {
//        adminRepository.RejecterUsersRegister(id);
//        return "redirect:/administrateur";
//    }


}