package br.com.sistemaescolar.modelo;

public enum Sexo {

	M("Masculino"), F("Feminino");

	private String valor;

	private Sexo(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	

//	@Override
//	public String toString() {
//		return valor;
//	}

}
