package br.com.plugsystem.application.mapper.marca;

import org.springframework.stereotype.Component;
import br.com.plugsystem.application.dto.marca.MarcaRequest;
import br.com.plugsystem.application.dto.marca.MarcaResponse;
import br.com.plugsystem.domain.models.MarcaModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@Component
@RequiredArgsConstructor
public class MarcaMapperImpl implements  MarcaMapper {

    private final ModelMapper mapper;

    @Override
    public MarcaResponse toResponse(MarcaModel model) {
        return mapper.map(model, MarcaResponse.class);
    }

    @Override
    public MarcaModel toModel(MarcaRequest request) {
        return mapper.map(request, MarcaModel.class);
    }
}
