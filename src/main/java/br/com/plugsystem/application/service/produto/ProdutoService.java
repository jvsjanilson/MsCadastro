package br.com.plugsystem.application.service.produto;

import java.util.List;

import br.com.plugsystem.application.dto.produto.ProdutoResponse;

public interface ProdutoService {

    public List<ProdutoResponse> list();
}
