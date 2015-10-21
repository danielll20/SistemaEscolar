/**
 * 
 */
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

/**
 * @author DL INFORMATICA - Soluções e serviços em tecnologia.
 *
 */

@Entity
@Table(name = "ALUNO")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ENDERECO")
	private Endereco endereco;

	@Column(name = "NOME_MAE")
	private String nomeMae;

	@Column(name = "NOME_PAI")
	private String nomePai;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_NASCIMENTO")
	private Date dataNascimento;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATA_CADASTRO")
	private Date dataCadastro;

	@Column(name = "SEXO")
	private Sexo sexo;

	@Column(name = "CPF")
	private Long cpf;

	@Column(name = "RG")
	private Long rg;

	@Column(name = "UF_RG")
	private String ufRG;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "CELULAR")
	private String celular;

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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

}
