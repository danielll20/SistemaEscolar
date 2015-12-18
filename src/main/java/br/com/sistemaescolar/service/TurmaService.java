/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.TurmaDao;
import br.com.sistemaescolar.modelo.Turma;

/**
 * @author Leonardo Ribeiro
 * @since 16/10/2015
 */
public class TurmaService {
	
	@Inject
	private TurmaDao turmaDao;
	
	public void insert(Turma turma) {
		turmaDao.insert(turma);
	}
	
	public List<Turma> listarTodas() {
		return turmaDao.listarTodas();
	}
	
	public Turma buscarPorId(Long id) {
		return turmaDao.buscarPorId(id);
	}
	
	public void atualizar(Turma turma) {
		turmaDao.update(turma);
	}
	
	public void remove(Turma turma) {
		turmaDao.delete(turma);
	}	

}
