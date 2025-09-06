package br.com.plugsystem.presentation.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.plugsystem.application.dto.unidade.UnidadeResponse;
import br.com.plugsystem.application.service.unidade.UnidadeService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/unidades")
@RequiredArgsConstructor
public class UnidadeController {

    private final UnidadeService service;

    @GetMapping
    public List<UnidadeResponse> index() {
        
        return service.list();
    }

}
