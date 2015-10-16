/**
 * 
 */
package br.com.sistemaescolar.service;

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

}
