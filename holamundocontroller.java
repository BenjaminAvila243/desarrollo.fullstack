package com.holamundo.ejemplo.holamundo.controlar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class holamundocontroller {


    @GetMapping("/hola")
    public String holamundo() {
        return "¡HOLA MUNDO!";
    }



}
