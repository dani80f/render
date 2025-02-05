package com.example.proyecto;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface Repositorio extends JpaRepository<Tarea, Integer> {

    List<Tarea> findByTitulo(String titulo);
}

