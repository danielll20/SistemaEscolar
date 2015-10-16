/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

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
	
	public List<Aluno> listarTodos() {
		return alunoDao.listarTodos();
	}
	

	public Aluno buscarPorId(Long id) {				
		return alunoDao.buscarPorId(id);
	}

	public void remove(Aluno aluno) {
		alunoDao.delete(aluno);
		
	}

	public void atualizar(Aluno aluno) {
		alunoDao.update(aluno);
		
	}
}
