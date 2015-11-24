/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;
import javax.persistence.NoResultException;

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

	public void atribuirDisciplinaProfessor(AtribuicaoDisciplina atribuicaoDisciplina) {
		atribuirDisciplinaDao.insert(atribuicaoDisciplina);
	}

	public AtribuicaoDisciplina buscaPorId(Long id) {		
		return atribuirDisciplinaDao.buscaPorId(id);
	}

	public void remove(AtribuicaoDisciplina atribuicaoDisciplina) {
		atribuirDisciplinaDao.delete(atribuicaoDisciplina);	
	}

	public AtribuicaoDisciplina verificaAtribuicaoDisciplina(Long idDisciplina, Long idProfessor) throws NoResultException {
		AtribuicaoDisciplina verificaAtribuicaoDisciplina = null;
		
		try {
			verificaAtribuicaoDisciplina = atribuirDisciplinaDao.verificaAtribuicaoDisciplina(idDisciplina, idProfessor);
		} catch (Exception e) {			
		}
		 						
		return verificaAtribuicaoDisciplina;
	}

}
