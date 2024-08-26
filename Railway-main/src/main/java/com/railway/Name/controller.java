package com.railway.Name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/miNombre")
    public String miNombre() {
        return "Samuel Eduardo Perez Cotom";  // Nombre
    }
}