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
@Table(name = "BOLETIM")
public class Boletim {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_MATRICULA")
	private Matricula matricula;

	@OneToOne
	@JoinColumn(name = "ID_PRIMEIRO_BIMESTRE")
	private PrimeiroBimestre primeiroBimestre;

	@OneToOne
	@JoinColumn(name = "ID_SEGUNDO_BIMESTRE")
	private SegundoBimestre segundoBimestre;

	@OneToOne
	@JoinColumn(name = "ID_TERCEIRO_BIMESTRE")
	private TerceiroBimestre terceiroBimestre;

	@OneToOne
	@JoinColumn(name = "ID_QUARTO_BIMESTRE")
	private QuartoBimestre quartoBimestre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public PrimeiroBimestre getPrimeiroBimestre() {
		return primeiroBimestre;
	}

	public void setPrimeiroBimestre(PrimeiroBimestre primeiroBimestre) {
		this.primeiroBimestre = primeiroBimestre;
	}

	public SegundoBimestre getSegundoBimestre() {
		return segundoBimestre;
	}

	public void setSegundoBimestre(SegundoBimestre segundoBimestre) {
		this.segundoBimestre = segundoBimestre;
	}

	public TerceiroBimestre getTerceiroBimestre() {
		return terceiroBimestre;
	}

	public void setTerceiroBimestre(TerceiroBimestre terceiroBimestre) {
		this.terceiroBimestre = terceiroBimestre;
	}

	public QuartoBimestre getQuartoBimestre() {
		return quartoBimestre;
	}

	public void setQuartoBimestre(QuartoBimestre quartoBimestre) {
		this.quartoBimestre = quartoBimestre;
	}

}
