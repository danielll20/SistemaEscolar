/**
 * 
 */
package br.com.sistemaescolar.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Daniel Correia
 * @since 04/12/2015 
 *
 */
@Entity
@Table(name = "ATRIBUIR_PROFESSOR_TURMA")
public class AtribuirProfessorTurma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_PROFESSOR")
	private Professor professor;
	
	@ManyToOne
	@JoinColumn(name = "ID_TURMA")
	private Turma turma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
