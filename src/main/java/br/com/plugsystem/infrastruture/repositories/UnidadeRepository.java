package br.com.plugsystem.infrastruture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plugsystem.domain.models.UnidadeModel;

public interface UnidadeRepository extends JpaRepository<UnidadeModel, Long> {
    
}
