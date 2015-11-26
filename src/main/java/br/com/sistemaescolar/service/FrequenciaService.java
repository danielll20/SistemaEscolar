/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.FrequenciaDao;
import br.com.sistemaescolar.modelo.Frequencia;
import br.com.sistemaescolar.modelo.Matricula;

/**
 * @author Daniel Correia
 * @since 16/11/2015
 *
 */
public class FrequenciaService {

	@Inject 
	private FrequenciaDao frequenciaDao;
	
	public List<Matricula> listarAlunosPorCursoTurma(Long id) {
		return frequenciaDao.listarAlunosPorCursoTurma(id);
	}

	public void insert(Frequencia frequencia) {
		frequenciaDao.insert(frequencia);		
	}
}
