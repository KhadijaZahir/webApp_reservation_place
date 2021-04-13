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
	//The @Qualifier annotation is used to resolve the autowiring conflict, when there are multiple beans of same type
	//@Qualifier annotation can be used on any class annotated with @Component
	@Qualifier("typeReservationService")
	@Autowired
	private TypeReservationService trdi;
	private TypereservationEntity typeReser = new TypereservationEntity();

	//if we don't specify a value, it's going to map to any HTTP request.
	@RequestMapping("typeReservation")
	public String typeReserv(ModelMap modelMap) {
		List<TypereservationEntity> theType = trdi.getAllTypeReservation();
		modelMap.put("typeRe", theType);
		return "typeReservation";
		// the model used for rendering views.
		//ModelMap is also used to pass values to render a view
		//The advantage of ModelMap is it gives us the ability to pass a collection of values and treat these values as if they were within a Map
		//Model is an interface while ModelMap is a class
		// modelAndView : to pass values to a view
	}

   //form of add type of reservation with action Addtype
	@RequestMapping(value = "Addtype", method = RequestMethod.POST)
	public String addType(Model model , HttpServletRequest req) {
		String typeRes = req.getParameter("typeRes");
		int nomberPlaces =Integer.parseInt(req.getParameter("nomberPlaces")) ;
		String datenbplace = req.getParameter("datenbplace");
		TypereservationEntity typeReser = new TypereservationEntity(typeRes,nomberPlaces,datenbplace);
		trdi.addTypeReservation(typeReser);

		return "redirect:/typeReservation";

	}
    //button delete
	@RequestMapping(value = "deleteType", method = RequestMethod.POST)
	public String deleteType(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		trdi.removeTypeReservation(id);
		return "redirect:/typeReservation";
	}

}
