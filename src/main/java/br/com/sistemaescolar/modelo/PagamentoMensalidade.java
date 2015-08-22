/**
 * 
 */
package br.com.sistemaescolar.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Daniel Correia
 *
 */
@Entity
@Table(name = "PAGAMENTO_MENSALIDADE")
public class PagamentoMensalidade {

	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_PAGAMENTO")
	private Date dataPagamento;
	
	@Column(name = "DESCONTO")
	private Double desconto;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_BOLETO")
	private Boleto boleto;
	
	
}
