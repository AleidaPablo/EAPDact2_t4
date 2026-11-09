package com.aleidapablo.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.aleidapablo.spring.models.dto.Empleados;
import com.aleidapablo.spring.models.dto.ParametroDto;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensajeConfig;

    @Value("${config.valores}")
    private String[] valores;

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDto paginaUno(@PathVariable String mensaje) {
        ParametroDto param = new ParametroDto();
        param.setInformacion(mensaje);
        return param;
    }

    @PostMapping("/solicitud")
    public Empleados creaEmpleado(@RequestBody Empleados empleado1) {
        return empleado1;
    }

    @GetMapping("/valores")
    public Map<String, Object> mostrarValores() {
        Map<String, Object> json = new HashMap<>();
        json.put("usuario", usuario);
        json.put("codigo", codigo);
        json.put("mensaje", mensajeConfig);
        json.put("valores", valores);
        return json;
    }
}