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
@Table(name = "PAGAMENTO_PROFESSOR")
public class PagamentoProfessor {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "SALARIO_PROFESSOR")
	private Double salarioProfessor;

	@Column(name = "VALOR_PAGO")
	private Double valorPago;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_PAGAMENTO")
	private Date dataPagamento;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PROFESSOR")
	private Professor professor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSalarioProfessor() {
		return salarioProfessor;
	}

	public void setSalarioProfessor(Double salarioProfessor) {
		this.salarioProfessor = salarioProfessor;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
