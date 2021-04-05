package org.example.controller;

import org.example.dao.UtilisateurDao;
import org.example.model.UtilisateurEntity;
import org.example.repositories.LoginRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Qualifier("UtilisateurDao")
    @Autowired
    private UtilisateurDao userDao;

    @RequestMapping
    public String Login(HttpSession session) {
        if (session.getAttribute("user_authentified") != null) {
            return "redirect:/dashboard";
        }
        return "login";
    }

    @RequestMapping(value = "/Account", method = RequestMethod.POST)
    public String account(HttpSession session, HttpServletRequest req, ModelMap modelMap) {

        UtilisateurEntity user = new UtilisateurEntity();
        LoginRepostory userRep=new LoginRepostory();
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        user = userRep.getUserByEmail(email);
        if (user.getPassword().equals(pass)) {
            session.setAttribute("user_authentified", user);
            if(user.getRole().getRoleName().equals("admin")) {
                return "administrateur";

            }
            else if (user.getRole().getRoleName().equals("student")) {
                return "apprenant";
            }

        } else {
            return "login";
        }

        return "login";

    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }



}
