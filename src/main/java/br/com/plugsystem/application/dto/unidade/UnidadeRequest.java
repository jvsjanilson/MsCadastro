package br.com.plugsystem.application.dto.unidade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnidadeRequest{
    private String codigo;
    private String nome;
}
