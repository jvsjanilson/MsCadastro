package br.com.plugsystem.application.mapper.produto;

import br.com.plugsystem.application.dto.produto.ProdutoRequest;
import br.com.plugsystem.application.dto.produto.ProdutoResponse;
import br.com.plugsystem.domain.models.ProdutoModel;

public interface ProdutoMapper {
    ProdutoResponse toResponse(ProdutoModel model);
    ProdutoModel toModel(ProdutoRequest request);
}
