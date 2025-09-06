package br.com.plugsystem.application.service.marca;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.plugsystem.application.dto.marca.MarcaResponse;
import br.com.plugsystem.application.mapper.marca.MarcaMapper;
import br.com.plugsystem.infrastruture.repositories.MarcaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository repo;
    private final MarcaMapper mapper;

    @Override
    public List<MarcaResponse> list() {
        return repo.findAll()
            .stream()
            .map(mapper::toResponse)
            .toList();
    }
    
}
