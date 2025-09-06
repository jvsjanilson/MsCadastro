package br.com.plugsystem.infrastruture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plugsystem.domain.models.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
    
}
