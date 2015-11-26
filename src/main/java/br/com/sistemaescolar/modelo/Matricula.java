/**
 * 
 */
package br.com.sistemaescolar.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Leonardo
 *
 */
@Entity
@Table(name = "MATRICULA")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;		
		
	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_MATRICULA")
	private Date dataMatricula;
	
	@Column(name = "VALOR_MATRICULA")
	private Double valorMatricula;
	
	@Column(name = "QNT_MESES")
	private int qntMeses;
	
	@Column(name = "VALOR_TOTAL")
	private Double valorTotal;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_MATRICULA")
	private List<Boleto> boleto;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	private Aluno aluno;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_TURMA")
	private Turma turma;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "ID_SITUACAO")
	private Situacao situacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Double getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(Double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public int getQntMeses() {
		return qntMeses;
	}

	public void setQntMeses(int qntMeses) {
		this.qntMeses = qntMeses;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Boleto> getBoleto() {
		return boleto;
	}

	public void setBoleto(List<Boleto> boleto) {
		this.boleto = boleto;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
}
