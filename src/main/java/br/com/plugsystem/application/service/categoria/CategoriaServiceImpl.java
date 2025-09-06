package br.com.plugsystem.application.service.categoria;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.plugsystem.application.dto.categoria.CategoriaResponse;
import br.com.plugsystem.application.mapper.categoria.CategoriaMapper;
import br.com.plugsystem.infrastruture.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository repo;
    private final CategoriaMapper mapper;

    @Override
    public List<CategoriaResponse> list() {
        return repo.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

}
