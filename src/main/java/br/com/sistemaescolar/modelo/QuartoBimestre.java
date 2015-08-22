/**
 * 
 */
package br.com.sistemaescolar.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 * @author Daniel Correia
 *
 */
@Entity
@Table(name = "QUARTO_BIMESTRE")
public class QuartoBimestre {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "PRIMEIRA_NOTA")
	private Double primeiraNota;

	@Column(name = "SEGUNDA_NOTA")
	private Double segundaNota;

	@Column(name = "MEDIA")
	private Double media;

	@OneToOne
	@JoinColumn(name = "ID_FREQUENCIA")
	private Frequencia falta;

	@OneToOne
	@JoinColumn(name = "ID_DISCIPLINA")
	private Disciplina disciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrimeiraNota() {
		return primeiraNota;
	}

	public void setPrimeiraNota(Double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}

	public Double getSegundaNota() {
		return segundaNota;
	}

	public void setSegundaNota(Double segundaNota) {
		this.segundaNota = segundaNota;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Frequencia getFalta() {
		return falta;
	}

	public void setFalta(Frequencia falta) {
		this.falta = falta;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
