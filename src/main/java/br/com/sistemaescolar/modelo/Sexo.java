package br.com.sistemaescolar.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sexo")
public class Sexo {
	
	@Id @GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "DESCRICAO")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

//	M("Masculino"), F("Feminino");
//
//	private String valor;
//
//	private Sexo(String valor) {
//		this.valor = valor;
//	}
//
//	public String getValor() {
//		return valor;
//	}
	
	

//	@Override
//	public String toString() {
//		return valor;
//	}

}
