/**
 * 
 */
package br.com.sistemaescolar.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Daniel Correia
 *
 */
@Entity
@Table(name = "CAIXA")
public class Caixa {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PAG_MENSALIDADE")
	private PagamentoMensalidade pagamentoMensalidade;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_SAL_PROFESSOR")
	private PagamentoProfessor pagamentoProfessor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_SAL_FUNCIONARIO")
	private PagamentoFuncionario salarioFunconario;
	
	
}
