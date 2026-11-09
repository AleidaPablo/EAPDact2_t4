package com.aleidapablo.spring.app1.springboot_applications.controllers;


import org.springframework.web.bind.annotation.*;
import com.aleidapablo.spring.models.dto.ParametroDto;

@RestController
@RequestMapping("/api/parametros")
public class RequestParamController {

    @GetMapping("/detalle")
    public ParametroDto detalle(
        @RequestParam(name = "informacion", required = false, defaultValue = "Hola a todos") String informacion
    ) {
        ParametroDto dto = new ParametroDto();
        dto.setInformacion(informacion);
        return dto;
    }
}