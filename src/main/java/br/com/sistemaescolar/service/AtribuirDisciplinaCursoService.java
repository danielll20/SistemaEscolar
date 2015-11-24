/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import br.com.sistemaescolar.dao.AtribuirDisciplinaCursoDao;
import br.com.sistemaescolar.modelo.AtribuirDisciplinaCurso;

/**
 * @author Daniel Correia
 * @since 19/11/2015
 */
public class AtribuirDisciplinaCursoService {
	
	@Inject
	private AtribuirDisciplinaCursoDao atribuirDisciplinaCursoDao;
	
	public void atribuirDisciplinaCurso(AtribuirDisciplinaCurso atribuirDisciplinaCurso) {
		atribuirDisciplinaCursoDao.insert(atribuirDisciplinaCurso);
	}
	
	public AtribuirDisciplinaCurso buscaPorId(Long id) {		
		return atribuirDisciplinaCursoDao.buscaPorId(id);
	}
	
	public void remove(AtribuirDisciplinaCurso atribuirDisciplinaCurso) {
		atribuirDisciplinaCursoDao.delete(atribuirDisciplinaCurso);	
	}

	public AtribuirDisciplinaCurso verificaAtribuicaoDisciplinaCurso(Long idDisciplina, Long idCurso) throws NoResultException {
		AtribuirDisciplinaCurso verificaAtribuicaoDisciplinaCurso = null;
		
		try {
			verificaAtribuicaoDisciplinaCurso = atribuirDisciplinaCursoDao.verificaAtribuicaoDisciplinaCurso(idDisciplina, idCurso);
		} catch (Exception e) {			
		}
		 						
		return verificaAtribuicaoDisciplinaCurso;
	}

}
