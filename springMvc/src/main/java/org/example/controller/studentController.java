package org.example.controller;

import org.example.dao.ReservationDaoImpl;
import org.example.dao.TypeReservationDao;
import org.example.dao.TypeReservationDaoImpl;
import org.example.model.*;
import org.example.repositories.LoginRepostory;
import org.example.repositories.ReservationRepository;
import org.example.service.ReservationService;
import org.example.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
@Controller
public class studentController {
    @Qualifier("reservationService")
    @Autowired
    private ReservationService reservationService;
    @Autowired
	private ReservationRepository resRepo;

    @Autowired
    private TypeReservationDao typeReservationDao;


//    @RequestMapping("/reservation")
//    public String listTtype(ModelMap modelMap) {
//        List<TypereservationEntity> theType = typeReservationDao.getAllTypeReservation();
//        modelMap.put("listTR",theType);
//        return "student";
//            }

    @RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public String showRegister(Model model) {
        System.out.println("hhiiiii reservation");
        List<TypereservationEntity> theType = typeReservationDao.getAllTypeReservation();
        model.addAttribute("listTR", theType);
        return "reservation";
    }

    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
    public String addReservation(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();

//        TypereservationEntity listTr = typeDao.getById(3);
        String date = request.getParameter("datedate");
        String category = request.getParameter("category");
        TypereservationEntity listTr = resRepo.getResByName(category);
        ReservationEntity res = new ReservationEntity();
        res = new ReservationEntity(false, date, (UtilisateurEntity) session.getAttribute("user_authentified"), listTr);
        //
        System.out.println("hhiiiii date");
        reservationService.addRes(res);

        return "redirect:/dashboard";
    }

    @RequestMapping(value = "addResBut")
	public String listType(ModelMap modelMap ) {
		List<TypereservationEntity> listTr = typeReservationDao.getAllTypeReservation();
//		modelMap.put("listTr", listTr);
		modelMap.addAttribute("listTr", listTr);
		return "addReservation";

	}


    //    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
//    public ModelAndView addReservation(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("hhiiiii date");
//        TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//        TypereservationEntity TypeRese = typeDao.getById(3);
//        String date = request.getParameter("datedate");
////        res.setDatereservation(request.getParameter("datedate"));
//        ReservationEntity res = new ReservationEntity();
//        res = new ReservationEntity(false, date, res.getUtilisateur(), TypeRese);
//        reservationService.addRes(res);
//        return new ModelAndView("apprenant");
//
////        return new ModelAndView("apprenant", "date", res.getDatereservation());
//    }
}