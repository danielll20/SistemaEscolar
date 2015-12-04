/**
 * 
 */
package br.com.sistemaescolar.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Leonardo
 *
 */
@Entity
@Table(name = "TURMA")
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@OneToOne
	@JoinColumn(name = "ID_CURSO")
	private Curso curso;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_INICIO")
	private Date dataInicio;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_FIM")
	private Date dataFim;

	@Column(name = "HOARIO_ENTRADA")
	private String horarioEntrada;

	@Column(name = "HORARIO_SAIDA")
	private String horarioSaida;

	@Column(name = "CARGA_HORARIA")
	private int cargaHoraria;

	@Column(name = "NUMERO_VAGAS")
	private int numeroVagas;
	
	@Column(name = "TURNO")
	private String turno;
	
	@ManyToMany
	@JoinTable(name = "ATRIBUIR_PROFESSOR_TURMA", joinColumns = @JoinColumn(name = "ID_TURMA"), inverseJoinColumns = @JoinColumn(name = "ID_PROFESSOR"))
	private List<Professor> professores;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public String getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
		
}
