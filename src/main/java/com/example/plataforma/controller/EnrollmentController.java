package com.example.plataforma.controller;

import com.example.plataforma.model.Enrollment;
import com.example.plataforma.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    // POST: Para registrar una nueva inscripción
    // URL: http://44.219.207.137:8080/enrollments
    @PostMapping
    public Enrollment inscribir(@RequestBody Enrollment inscripcion) {
        // El repositorio guarda la entidad en Oracle Cloud
        return enrollmentRepository.save(inscripcion);
    }

    // GET: Para listar todas las inscripciones realizadas
    // URL: http://44.219.207.137:8080/enrollments
    @GetMapping
    public List<Enrollment> listarInscripciones() {
        return enrollmentRepository.findAll();
    }
}