package com.aleidapablo.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object> detallesInfo2() {
        Map<String, Object> respuesta = new HashMap<>();
        
        respuesta.put("titulo", "springboot-applications");
        respuesta.put("estudiante", "Evelin Aleida Pablo Delgado");
        respuesta.put("IP", "192.168.1.1");
        return respuesta;
    }

    @GetMapping("/saludo")
    public Map<String, String> saludo() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "¡Hola soy Aleida Pablo!");
        return respuesta;
    }
}
