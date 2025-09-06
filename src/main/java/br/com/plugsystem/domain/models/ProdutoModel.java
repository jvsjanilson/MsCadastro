package br.com.plugsystem.domain.models;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produto")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = true)
    private String sku;

    @Column(length = 13, nullable = true)
    private String gtin;

    @Column(length = 120)
    private String nome;

    @ManyToOne(fetch= FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="unidade_id", nullable=false)
    private UnidadeModel unidade;

    @ManyToOne(fetch= FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="marca_id", nullable=false)
    private MarcaModel marca;

    @ManyToOne(fetch= FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="categoria_id", nullable=false)
    private CategoriaModel categoria;

    @Column(precision=15, scale=2)
    private BigDecimal preco;

    private Integer estoque;

}
