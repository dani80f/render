package com.example.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tareas")
public class TareaController {

    private final TareaDatos tareaRepository;

    public TareaController(TareaDatos tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @GetMapping
    public String listarTareas(Model model) {

        List<Tarea> tareas = tareaRepository.findAll();
        model.addAttribute("tareas", tareas);
        return "tareas";

    }

    @PostMapping("/anadir")

    public String agregarTarea(@RequestParam("titulo") String titulo,
                               @RequestParam("descripcion") String descripcion) {
        tareaRepository.save(new Tarea( titulo, descripcion));
        return "redirect:/tareas";

    }

    @PostMapping("/eliminar/{id}")

    public String eliminarTarea(@PathVariable Long id) {
        tareaRepository.deleteById(id);
        return "redirect:/tareas";
    }

}

