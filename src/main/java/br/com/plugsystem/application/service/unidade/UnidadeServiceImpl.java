package br.com.plugsystem.application.service.unidade;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.plugsystem.application.dto.unidade.UnidadeResponse;
import br.com.plugsystem.application.mapper.unidade.UnidadeMapper;
import br.com.plugsystem.infrastruture.repositories.UnidadeRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UnidadeServiceImpl implements UnidadeService {

    private final UnidadeRepository repo;
    private final UnidadeMapper mapper;

    @Override
    public List<UnidadeResponse> list() {
        return repo.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
