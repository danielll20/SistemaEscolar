package br.com.sistemaescolar.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CPF")
	private Long cpf;

	@Column(name = "RG")
	private Long rg;

	@Column(name = "UF_RG")
	private String ufRG;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ENDERECO")
	private Endereco endereco;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "CELULAR")
	private String celular;
	
	@OneToOne
	@JoinColumn(name = "ID_SEXO")
	private Sexo sexo;

	@Column(name = "NOME_BANCO")
	private String nomeBanco;

	@Column(name = "CONTA")
	private String conta;

	@Column(name = "AGENCIA")
	private String agencia;

	@Column(name = "CARGO")
	private String cargo;

	@Column(name = "VALOR_SALARIO")
	private Double valorSalario;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_CADASTRO")
	private Date dataCadastro;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_NASCIMENTO")
	private Date dataNascimento;

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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getUfRG() {
		return ufRG;
	}

	public void setUfRG(String ufRG) {
		this.ufRG = ufRG;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(Double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
