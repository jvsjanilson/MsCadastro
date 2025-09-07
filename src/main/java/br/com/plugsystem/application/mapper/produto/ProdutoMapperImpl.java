package br.com.plugsystem.application.mapper.produto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.plugsystem.application.dto.produto.ProdutoRequest;
import br.com.plugsystem.application.dto.produto.ProdutoResponse;
import br.com.plugsystem.domain.models.ProdutoModel;

@Component
public class ProdutoMapperImpl implements ProdutoMapper {

    private final ModelMapper mapper;

    public ProdutoMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;

        // mapper.typeMap(ProdutoModel.class, ProdutoResponse.class)
        //     .addMapping(src -> src.getUnidade().getCodigo(), ProdutoResponse::setUnidadeCodigo)
        //     .addMapping(src -> src.getCategoria().getNome(), ProdutoResponse::setCategoriaNome)
        //     .addMapping(src -> src.getMarca().getNome(), ProdutoResponse::setMarcaNome)
        // ;
    }

    @Override
    public ProdutoResponse toResponse(ProdutoModel model) {
        return mapper.map(model, ProdutoResponse.class);
    }

    @Override
    public ProdutoModel toModel(ProdutoRequest request) {
        return mapper.map(request, ProdutoModel.class);
    }

}
