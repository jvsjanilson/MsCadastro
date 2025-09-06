package br.com.plugsystem.infrastruture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plugsystem.domain.models.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    
}
