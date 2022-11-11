package br.com.ifpe.oxefoodcarlos.modelo.cupomDesconto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodcarlos.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CupomDesconto")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CupomDesconto extends EntidadeAuditavel {
	
	private static final long serialVersionUID = 
	
	@Column
	private int quantidadeUso;
	
	@Column
	private double valorMinimoPedidoPermitidos;
	
	@Column
	private double valorDesconto;
	
	@Column
	private double percentualDesconto;
	
	@Column
	private String codigoDesconto;
	
	@Column
	private String chave;
		
	@Column
	private long versao;
	
	@Column
	private long criadoPor;
	
	@Column
	private long ultimaModificadoPor;
	

}
