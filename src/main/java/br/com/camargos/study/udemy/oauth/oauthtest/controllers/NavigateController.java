package br.com.camargos.study.udemy.oauth.oauthtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

@Controller
public class NavigateController {

    @GetMapping("/principal")
    public String displayHomePage(Model model, @AuthenticationPrincipal OAuth2User principal) {

        if (principal != null) {
            String name  = principal.getAttribute("name").toString();
            model.addAttribute("name", name);
        }
        
        return "home";
    }
    

}
