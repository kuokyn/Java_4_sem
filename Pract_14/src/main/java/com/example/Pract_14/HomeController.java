package com.example.Pract_14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Viktoria Nikiforova IKBO-16-20");
        return "home";
    }
}
