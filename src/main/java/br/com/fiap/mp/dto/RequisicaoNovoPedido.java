//Nome: Thiago Gyorgy Teixeira de Castro
//RM: 97136

package br.com.fiap.mp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequisicaoNovoPedido(
		@NotBlank
		@Size(min = 5, max = 250, message="quantidade mínima 5 e máxima 250 caracteres")
		String nomeProduto,
		@NotBlank
		String urlProduto,
		@NotBlank
		String urlImagem,
		String descricao		
	) {

}
