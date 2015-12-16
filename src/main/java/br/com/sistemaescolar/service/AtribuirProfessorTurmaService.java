/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.AtribuirProfessorTurmaDao;
import br.com.sistemaescolar.modelo.AtribuirProfessorTurma;

/**
 * @author Daniel Correia
 * @since 16/12/2015
 *
 */
public class AtribuirProfessorTurmaService {

	@Inject
	private AtribuirProfessorTurmaDao atribuirProfessorTurmaDao;
	
	public void insert(AtribuirProfessorTurma atribuirProfessorTurma) {
		atribuirProfessorTurmaDao.insert(atribuirProfessorTurma);
	}

	public List<AtribuirProfessorTurma> listarProfessoresDaTurma(Long idTurma) {
		return atribuirProfessorTurmaDao.listarProfessoresDaTurma(idTurma);
	}
}
