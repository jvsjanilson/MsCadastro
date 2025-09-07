package br.com.plugsystem.application.service.produto;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.plugsystem.application.dto.produto.ProdutoResponse;
import br.com.plugsystem.application.mapper.produto.ProdutoMapper;
import br.com.plugsystem.infrastruture.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repo;
    private final ProdutoMapper mapper;

    @Override
    public List<ProdutoResponse> list() {
        return repo.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

}
