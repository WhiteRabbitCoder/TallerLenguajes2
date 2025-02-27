package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")

public class EjemploParamsController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("titulo", "Recibir parametros de la ruta (@PathVariable)");
        return "parametros/index";
    }co
@GetMapping("/string")
    public String param(@RequestParam String texto, Model model){
        model.addAttribute("titulo", "Recibir parametros de la ruta HTTP GET - URL");
        model.addAttribute("resultado", "El texto enviado es: " + texto);

        return "parametros/ver";
    }

    @GetMapping("/mix-params")
    public String param(@RequestParam (name="saludo", required = false, defaultValue = "Hola!")String texto, @RequestParam Integer num,Model model){
        model.addAttribute("titulo", "Recibir parametros de la ruta HTTP GET - URL");
        model.addAttribute("resultado", "El texto enviado es: " + texto + " y el numero es: " + num);
        return "parametros/ver";
    }
}


