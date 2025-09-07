package br.com.plugsystem.application.dto.produto;

import java.math.BigDecimal;

import br.com.plugsystem.domain.models.CategoriaModel;
import br.com.plugsystem.domain.models.MarcaModel;
import br.com.plugsystem.domain.models.UnidadeModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {
    
    private String sku;
    private String gtin;
    private String nome;   
    private UnidadeModel unidade;
    private MarcaModel marca; 
    private CategoriaModel categoria;
    private BigDecimal preco;
    private Integer estoque;
}
