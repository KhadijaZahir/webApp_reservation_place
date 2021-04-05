package org.example.controller;

import org.example.dao.TypeReservationDaoImpl;
import org.example.model.TypereservationEntity;
import org.example.service.TypeReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TypeReservationController {
	@Qualifier("typeReservationService")
	@Autowired
	private TypeReservationService trdi;
	private TypereservationEntity typeReser = new TypereservationEntity();

	@RequestMapping("typeReservation")
	public ModelAndView typeReserv(ModelMap modelMap) {
		List<TypereservationEntity> theType = trdi.getAllTypeReservation();
		modelMap.put("typeRe", theType);
		return new ModelAndView("typeReservation");
	}


	@RequestMapping(value = "Addtype", method = RequestMethod.POST)
	public String addType(Model model , HttpServletRequest req) {
		String typeRes = req.getParameter("typeRes");
		int nomberPlaces =Integer.parseInt(req.getParameter("nomberPlaces")) ;
		String datenbplace = req.getParameter("datenbplace");
		TypereservationEntity typeReser = new TypereservationEntity(typeRes,nomberPlaces,datenbplace);
		trdi.addTypeReservation(typeReser);

		return "redirect:/typeReservation";

	}

	@RequestMapping(value = "deleteType", method = RequestMethod.POST)
	public String deleteType(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		trdi.removeTypeReservation(id);
		return "redirect:/typeReservation";
	}

//	@RequestMapping("DispalyEditType")
//	public String DispalyEditType(Model model,HttpServletRequest req) {
//		int id = Integer.parseInt(req.getParameter("id"));
//		typeReser= trdi.getAllTypeReservation(id);
//		model.addAttribute("typeRe", typeReser);
//
//
//		return "updateTypeReservation";
//
//	}
//
//
//	@RequestMapping(value = "UpdateType", method = RequestMethod.POST)
//	public String UpdateType(Model model ,HttpServletRequest req) {
//
//		long id = Long.parseLong(req.getParameter("id"));
//		String typeRes = req.getParameter("typeRes");
//		int nomberPlaces =Integer.parseInt(req.getParameter("nomberPlaces")) ;
//		String datenbplace = req.getParameter("datenbplace");
//		TypereservationEntity typeReser = new TypereservationEntity((int) id, typeRes, nomberPlaces, datenbplace);
//		trdi.updateTypeReservation(typeReser);
//
//		return "redirect:/typeReservation";
//
//	}

}
