package br.com.plugsystem.infrastruture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plugsystem.domain.models.MarcaModel;

public interface MarcaRepository extends JpaRepository<MarcaModel, Long> {
    
}
