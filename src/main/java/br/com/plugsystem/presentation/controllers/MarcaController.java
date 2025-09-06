package br.com.plugsystem.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.plugsystem.application.dto.marca.MarcaResponse;
import br.com.plugsystem.application.service.marca.MarcaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/marcas")
@RequiredArgsConstructor
public class MarcaController {

    private final MarcaService service;

    @GetMapping
    public List<MarcaResponse> index()
    {
        return service.list();
    }
    
}
