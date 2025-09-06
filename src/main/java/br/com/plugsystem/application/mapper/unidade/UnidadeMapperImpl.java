package br.com.plugsystem.application.mapper.unidade;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.plugsystem.application.dto.unidade.UnidadeRequest;
import br.com.plugsystem.application.dto.unidade.UnidadeResponse;
import br.com.plugsystem.domain.models.UnidadeModel;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UnidadeMapperImpl implements UnidadeMapper {

    private final ModelMapper mapper;

    @Override
    public UnidadeResponse toResponse(UnidadeModel model) {
        return mapper.map(model, UnidadeResponse.class);
    }

    @Override
    public UnidadeModel toModel(UnidadeRequest request) {
        return mapper.map(request, UnidadeModel.class);
    }
}
