package br.com.plugsystem.application.mapper.unidade;

import br.com.plugsystem.application.dto.unidade.UnidadeRequest;
import br.com.plugsystem.application.dto.unidade.UnidadeResponse;
import br.com.plugsystem.domain.models.UnidadeModel;

public interface UnidadeMapper {
    UnidadeResponse toResponse(UnidadeModel model);
    UnidadeModel toModel(UnidadeRequest request);
}
