/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.AlunoDao;
import br.com.sistemaescolar.modelo.Aluno;

/**
 * Classe que trata as regras de négocio do aluno.
 * 
 * @author Daniel Correia
 * @since 31-08-2015
 *
 */
public class AlunoService {

	@Inject
	private AlunoDao alunoDao;
	
	public void insert(Aluno aluno) {
		alunoDao.insert(aluno);
	}
}
