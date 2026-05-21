package com.example.plataforma.controller;

import com.example.plataforma.model.Enrollment;
import com.example.plataforma.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnrollmentController {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    // Esta ruta será simplemente: http://44.219.207.137:8080/enrollments
    @PostMapping("/enrollments")
    public Enrollment inscribir(@RequestBody Enrollment inscripcion) {
        return enrollmentRepository.save(inscripcion);
    }
}