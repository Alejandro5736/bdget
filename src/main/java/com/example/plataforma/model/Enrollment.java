// Enrollment.java
package com.example.plataforma.model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "inscripciones")
@Data
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estudianteNombre;
    private Double totalPagar;

    @ManyToMany
    @JoinTable(name = "inscripcion_cursos",
               joinColumns = @JoinColumn(name = "inscripcion_id"),
               inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private List<Course> cursos;
}