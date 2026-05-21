// Course.java
package com.example.plataforma.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cursos")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String instructor;
    private String duracion;
    private Double costo;
}