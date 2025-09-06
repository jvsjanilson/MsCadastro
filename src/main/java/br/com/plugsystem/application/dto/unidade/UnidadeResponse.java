package br.com.plugsystem.application.dto.unidade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnidadeResponse {
    private Long id;
    private String codigo;
    private String nome;
}
