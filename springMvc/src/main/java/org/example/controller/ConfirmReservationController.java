package org.example.controller;

import org.example.model.ReservationEntity;
import org.example.model.UtilisateurEntity;
import org.example.repositories.AdminRepository;
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
public class ConfirmReservationController {

    private ReservationService reservationService;
    private ReservationEntity res;

//    @RequestMapping(value = "/confirmReservation", method = RequestMethod.POST)
//    public String historicReservation(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("hhiiiii confirmReservation");
//        return "redirect:/dashboard";
//    }
//
//        @RequestMapping(value = "/Reservation", method = RequestMethod.POST)
//    public String Confirmer(@RequestParam("id") int id) {
//            adminRepository.ConfirmerUsersRegister(id);
//        return "redirect:/dashboard";
//    }
//    @RequestMapping(value = "/confirmer", method = RequestMethod.POST)
//    public String confirmer() {
//        res.isConfirmerreservation();
//        return "redirect:/dashboard";
//    }


}