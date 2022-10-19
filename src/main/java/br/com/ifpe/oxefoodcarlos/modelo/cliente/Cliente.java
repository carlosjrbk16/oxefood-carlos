package br.com.ifpe.oxefoodcarlos.modelo.cliente;

import javax.persistence.GenerationType;

import br.com.ifpe.oxefoodcarlos.util.entity.EntidadeAuditavel;

@Entity
@Table(name = "Cliente");

public class Cliente extends EntidadeAuditavel {
	
	
	@Column
	private String chaveEmpresa;
	
	@Column
	private String nome;
	
	@Column
	private String cfp;
	
	@Column
	private String fone;
	
	@Column
	private String foneAlternativo;
	
	
	

}
