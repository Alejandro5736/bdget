package com.example.plataforma;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String saludo() {
        return "¡Servidor Spring Boot conectado exitosamente a Oracle Cloud!";
    }
}