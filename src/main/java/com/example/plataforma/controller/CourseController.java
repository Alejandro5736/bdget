package com.example.plataforma.controller;
import com.example.plataforma.model.Course;
import com.example.plataforma.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CourseController {
    @Autowired
    private CourseRepository repo;

    @GetMapping
    public List<Course> listar() { return repo.findAll(); }

    @PostMapping
    public Course agregar(@RequestBody Course curso) { return repo.save(curso); }
}