package br.com.plugsystem.application.mapper.produto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.plugsystem.application.dto.produto.ProdutoRequest;
import br.com.plugsystem.application.dto.produto.ProdutoResponse;
import br.com.plugsystem.domain.models.ProdutoModel;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProdutoMapperImpl implements ProdutoMapper {

    private final ModelMapper mapper;

    @Override
    public ProdutoResponse toResponse(ProdutoModel model) {
        return mapper.map(model, ProdutoResponse.class);
    }

    @Override
    public ProdutoModel toModel(ProdutoRequest request) {
        return mapper.map(request, ProdutoModel.class);
    }

}
