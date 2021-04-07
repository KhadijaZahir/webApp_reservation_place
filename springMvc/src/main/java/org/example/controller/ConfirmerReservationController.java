package org.example.controller;

import org.example.model.ReservationEntity;
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
public class ConfirmerReservationController {
    @Qualifier("utilisateurService")
    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private ReservationService reservationService;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private ReservationRepository reservationRepository;

    public UtilisateurEntity user = new UtilisateurEntity();

        @RequestMapping(value = "confirmerReservation")
        public String confimertReservation(ModelMap modelMap) {
//            List<UtilisateurEntity> student = utilisateurService.getAllUsers();
            List<ReservationEntity> resevation = reservationService.getAllRes();
//            modelMap.addAttribute("student", student);
            modelMap.addAttribute("resevation", resevation);
            return "confirmerReservation";

        }
//    @RequestMapping(value = "/confirmerReservation", method = RequestMethod.POST)
//    public String confimReservation() {
////        System.out.println("hhiiiii confirmRegister");
////        ReservationRepository confRese =new ReservationRepository();
////        confRese.confirmerResrvation(res);
//        return "redirect:/confirmerReservation";
//    }
//
//    @RequestMapping(value = "/confirmer", method = RequestMethod.POST)
//    public String confirmer(@RequestParam("id") int id) {
//        ReservationEntity res = new ReservationEntity();
//        ReservationRepository confRese =new ReservationRepository();
//        confRese.confirmerResrvation(res);
//        return "redirect:/confirmerReservation";
//    }
    @RequestMapping(value = "/confirmerRes", method = RequestMethod.POST)
    public String ConfirmerRes(@RequestParam("id") int id) {
        System.out.println(id);
        System.out.println("confirm here");
        reservationRepository.confirmerResrvation(id);
        return "redirect:/confirmerReservation";
    }
}
