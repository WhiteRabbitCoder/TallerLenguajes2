package com.example.demo.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("titulo", "Hola Mundo con Spring Boot");

        return "index";
    }
    @GetMapping("/perfil")
    public String perfil(Model model){
        model.addAttribute("titulo", "Perfil del usuario");
        model.addAttribute("nombre", "Juan");
        model.addAttribute("apellido", "Perez");
        model.addAttribute("email", "juanperez@gmail.com");

        return "perfil";
    }

}

