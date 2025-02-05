package com.example.proyecto;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaDatos extends JpaRepository<Tarea, Long> {



}