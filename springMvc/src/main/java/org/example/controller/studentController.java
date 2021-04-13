package org.example.controller;

import org.example.dao.TypeReservationDao;
import org.example.dao.TypeReservationDaoImpl;
import org.example.model.*;
import org.example.repositories.ReservationRepository;
import org.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
public class studentController {
    @Qualifier("reservationService")
    @Autowired
    private ReservationService reservationService;
    @Autowired
	private ReservationRepository resRepo;

    @Autowired
    private TypeReservationDao typeReservationDao;


    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
    public String addReservation(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
        String date = request.getParameter("datedate");
        String category = request.getParameter("category");
        TypereservationEntity listTr = resRepo.getResByName(category);
        ReservationEntity res = new ReservationEntity();
        res = new ReservationEntity(false, date, (UtilisateurEntity) session.getAttribute("user_authentified"), listTr);
        //
//        System.out.println("hhiiiii date");
        reservationService.addRes(res);

        return "redirect:/dashboard";
    }

    @RequestMapping(value = "addResBut")
	public String listType(ModelMap modelMap ) {
		List<TypereservationEntity> listTr = typeReservationDao.getAllTypeReservation();
		modelMap.addAttribute("listTr", listTr);
		return "addReservation";

	}


    @RequestMapping(value = "historicReservation")
    public String histReservation(ModelMap modelMap ) {

        List<ReservationEntity> listR = reservationService.getAllRes();
        modelMap.addAttribute("listR", listR);
        return "historicReservation";

    }

    @RequestMapping(value = "/historicReservation", method = RequestMethod.POST)
    public String historicReservation(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("hhiiiii historicReservation");
        reservationService.getAllRes();
        return "redirect:/dashboard";
    }



}