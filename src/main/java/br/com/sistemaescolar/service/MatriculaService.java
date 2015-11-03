/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.MatriculaDao;
import br.com.sistemaescolar.modelo.Matricula;

/**
 * Classe que trata as regras de negócio da matrícula.
 * 
 * @author Daniel Correia
 * @since 21/10/2015
 *
 */
public class MatriculaService {

	@Inject
	private MatriculaDao matriculaDao;
	
	public void insert(Matricula matricula) {
		matriculaDao.insert(matricula);
	}

	public List<Matricula> listarMatriculas() {
		return matriculaDao.listarMatriculas();
		
	}
}
