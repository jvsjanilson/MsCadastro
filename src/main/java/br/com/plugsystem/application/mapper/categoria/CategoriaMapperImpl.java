package br.com.plugsystem.application.mapper.categoria;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.plugsystem.application.dto.categoria.CategoriaRequest;
import br.com.plugsystem.application.dto.categoria.CategoriaResponse;
import br.com.plugsystem.domain.models.CategoriaModel;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CategoriaMapperImpl implements CategoriaMapper {

    private final ModelMapper mapper;

    @Override
    public CategoriaResponse toResponse(CategoriaModel model) {
        return mapper.map(model, CategoriaResponse.class);
    }

    @Override
    public CategoriaModel toModel(CategoriaRequest request) {
        return mapper.map(request, CategoriaModel.class);
    }
     
}
