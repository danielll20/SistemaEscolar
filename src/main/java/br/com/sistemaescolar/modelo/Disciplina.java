/**
 * 
 */
package br.com.sistemaescolar.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Leonardo
 *
 */
@Entity
@Table(name = "DISCIPLINA")
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CARGA_HORARIA")
	private int cargaHoraria;

	@ManyToMany
	@JoinTable(name = "ATRIBUICAO_DISCIPLINA", joinColumns = @JoinColumn(name = "ID_DISCIPLINA"), inverseJoinColumns = @JoinColumn(name = "ID_PROFESSOR"))
	private List<Professor> professores;
	
	@ManyToMany
	@JoinTable(name = "ATRIBUIR_DISCIPLINA_CURSO", joinColumns = @JoinColumn(name = "ID_DISCIPLINA"), inverseJoinColumns = @JoinColumn(name = "ID_CURSO"))
	private List<Curso> cursos;

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

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
