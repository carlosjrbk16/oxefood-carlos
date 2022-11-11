package br.com.ifpe.oxefoodcarlos.servicos.cupomDesconto;

import br.com.ifpe.oxefoodcarlos.modelo.cupomDesconto.CupomDesconto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CupomDescontoRequest {

	private String chaveEmpresa;
	
	private String codigoDesconto;
	
	private double valorDesconto;
	
	private double valorMinimoPedidoPermitido;
	
	private double percentualDesconto;
	
	private int quantidadeUso;
	


public CupomDesconto buildCupomDesconto() {

	CupomDesconto cupomDesconto = CupomDesconto.builder()
		.chave(chaveEmpresa)
		.codigoDesconto(codigoDesconto)
		.criadoPor(quantidadeUso)
		.percentualDesconto(percentualDesconto)
		.quantidadeUso(quantidadeUso)
		.valorMinimoPedidoPermitidos(valorMinimoPedidoPermitido)
		.build();
		
	
	return cupomDesconto;
    }
}
