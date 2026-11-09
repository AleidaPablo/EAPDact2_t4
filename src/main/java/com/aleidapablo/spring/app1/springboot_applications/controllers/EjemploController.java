package com.aleidapablo.spring.app1.springboot_applications.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.aleidapablo.spring.models.dto.Empleados;

@Controller
public class EjemploController {

    @Value("${config.usuario}")
    private String usuarioConfig;

    private List<Empleados> listaBase = new ArrayList<>(Arrays.asList(
        new Empleados("Juan", "Rodríguez", "Calle 1 N° 2", "Gerente", 35, 12345678, 1),
        new Empleados("María", "Pérez", "Calle 3 N° 4", "Secretaria", 20, 87654321, 2)
    ));

    @GetMapping("/detalles_info")
    public String info(@RequestParam(name = "puesto", required = false) String puesto, Model model) {
        List<Empleados> filtrados = listaBase;
        if (puesto != null && !puesto.trim().isEmpty()) {
            filtrados = listaBase.stream()
                    .filter(e -> e.getPuesto().equalsIgnoreCase(puesto.trim()))
                    .toList();
        }
        model.addAttribute("empleados", filtrados);
        model.addAttribute("usuarioConfig", usuarioConfig);
        return "detalles_info";
    }

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleados());
        return "formulario";
    }

    @PostMapping("/guardar_empleado")
    public String guardarEmpleado(@ModelAttribute Empleados empleado) {
        empleado.setId(listaBase.size() + 1);
        listaBase.add(empleado);
        return "redirect:/detalles_info";
    }
}