package com.example.plataforma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Map<String, String>> getStudentsFromScratch() {
        
        // Estudiante 1
        Map<String, String> estudiante1 = new HashMap<>();
        estudiante1.put("id", "1");
        estudiante1.put("nombre", "Carlos Fuentes");
        estudiante1.put("rut", "19.876.543-2");
        estudiante1.put("email", "carlos.fuentes@example.com");
        estudiante1.put("carrera", "Ingeniería en Informática");

        // Estudiante 2
        Map<String, String> estudiante2 = new HashMap<>();
        estudiante2.put("id", "2");
        estudiante2.put("nombre", "Elena Mendoza");
        estudiante2.put("rut", "20.123.456-7");
        estudiante2.put("email", "elena.mendoza@example.com");
        estudiante2.put("carrera", "Analista Programador");

        // Estudiante 3
        Map<String, String> estudiante3 = new HashMap<>();
        estudiante3.put("id", "3");
        estudiante3.put("nombre", "Andrés Salazar");
        estudiante3.put("rut", "18.456.789-K");
        estudiante3.put("email", "andres.salazar@example.com");
        estudiante3.put("carrera", "Ingeniería de Software");

        // Retornamos la lista completa en formato JSON automáticamente
        return Arrays.asList(estudiante1, estudiante2, estudiante3);
    }
}