/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.AtribuirDisciplinaDao;
import br.com.sistemaescolar.modelo.AtribuicaoDisciplina;

/**
 * @author Daniel Correia
 * @since 13/11/2015
 *
 */
public class AtribuirDisciplanaService {
	
	@Inject
	private AtribuirDisciplinaDao atribuirDisciplinaDao;

	public void atribuirDisciplinaProfessor(
			AtribuicaoDisciplina atribuicaoDisciplina) {
		atribuirDisciplinaDao.insert(atribuicaoDisciplina);
	}

}
