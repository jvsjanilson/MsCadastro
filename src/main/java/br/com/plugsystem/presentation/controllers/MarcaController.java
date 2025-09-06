package br.com.plugsystem.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @GetMapping
    public String index()
    {
        return "Marcas";
    }
    
}
