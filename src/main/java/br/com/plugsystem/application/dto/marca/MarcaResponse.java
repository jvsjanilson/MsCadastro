package br.com.plugsystem.application.dto.marca;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarcaResponse {
    private Long id;
    private String nome;
}
