/**
 * 
 */
package br.com.sistemaescolar.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Daniel Correia
 *
 */
@Entity
@Table(name = "BOLETO")
public class Boleto {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DATA_VENCIMENTO")
	private Date vencimento;
	
	@Column(name = "CODIGO_BARRA")
	private Integer codigoBarra;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Integer getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(Integer codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	
	
	
	
}
