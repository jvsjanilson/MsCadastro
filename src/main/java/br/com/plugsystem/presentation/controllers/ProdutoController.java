package br.com.plugsystem.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.plugsystem.application.dto.produto.ProdutoResponse;
import br.com.plugsystem.application.service.produto.ProdutoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping
    public List<ProdutoResponse> index() {
        return service.list();
    }
}
