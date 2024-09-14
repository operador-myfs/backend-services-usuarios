package com.operador.usuarios.controller;

import com.operador.usuarios.service.FraseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FraseController {

    private final FraseService fraseService;

    @GetMapping("/generar-frase")
    public String generarFrase() {
        return fraseService.generarFrase();
    }

}
