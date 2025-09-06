package br.com.plugsystem.application.mapper.marca;

import br.com.plugsystem.application.dto.marca.MarcaRequest;
import br.com.plugsystem.application.dto.marca.MarcaResponse;
import br.com.plugsystem.domain.models.MarcaModel;

public interface MarcaMapper {
    MarcaResponse toResponse(MarcaModel model);
    MarcaModel toModel(MarcaRequest request);
}
