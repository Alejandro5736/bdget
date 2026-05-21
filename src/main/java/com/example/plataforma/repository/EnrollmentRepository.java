package com.example.plataforma.repository;

import com.example.plataforma.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    // JpaRepository ya incluye todos los métodos necesarios (save, findAll, etc.)
}