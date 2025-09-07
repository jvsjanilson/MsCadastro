package br.com.plugsystem.application.dto.produto;

import java.math.BigDecimal;

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
    private String unidadeCodigo;
    private String marcaNome;
    private String categoriaNome;
    private BigDecimal preco;
    private Integer estoque;
}
