package com.example.demo.Controllers;
import com.example.demo.Entity.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/app")
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

    @GetMapping ("/listar")
    public String listar(Model model){
        List <Usuario> usuarios = new ArrayList<>();
        // Usuario usuario = new Usuario("Juan", "password123", "juan@example.com");
        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);
        usuarios.add(new Usuario("Andres", "Guzman", "ola"));
        usuarios.add(new Usuario("Juan", "Perez", "chao"));
        return "listar";
    }

}

