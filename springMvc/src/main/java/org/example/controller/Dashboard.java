package org.example.controller;

import org.example.model.UtilisateurEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/dashboard")
public class Dashboard {

    @RequestMapping
    public String getDashboard(HttpSession session) {
        UtilisateurEntity utilisateurEntity = (UtilisateurEntity) session.getAttribute("user_authentified");
        if (utilisateurEntity != null) {
            if (utilisateurEntity.getRole().getRoleName().equals("admin")) {
                System.out.println("admin");
                return "administrateur";

            }else if (utilisateurEntity.getRole().getRoleName().equals("student")) {
                System.out.println("student");
                return "apprenant";

            }
        }
        return null;
    }
}
