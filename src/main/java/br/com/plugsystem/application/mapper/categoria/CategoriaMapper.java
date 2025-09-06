package br.com.plugsystem.application.mapper.categoria;

import br.com.plugsystem.application.dto.categoria.CategoriaRequest;
import br.com.plugsystem.application.dto.categoria.CategoriaResponse;
import br.com.plugsystem.domain.models.CategoriaModel;

public interface CategoriaMapper {
    CategoriaResponse toResponse(CategoriaModel model);
    CategoriaModel toModel(CategoriaRequest request);
}
