/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.SituacaoDao;
import br.com.sistemaescolar.modelo.Situacao;

/**
 * @author Daniel Correia
 * @since 03/11/2015
 *
 */
public class SituacaoService {

	@Inject
	private SituacaoDao situacaoDao;
	
	public List<Situacao> listarTodos() {
		return situacaoDao.listarTodos();	
	}
	
	
}
