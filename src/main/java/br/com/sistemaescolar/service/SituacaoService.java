/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.SituacaoDao;

/**
 * @author Daniel Correia
 * @since 03/11/2015
 *
 */
public class SituacaoService {

	@Inject
	private SituacaoDao situacaoDao;
	
	public Long listarSituacao() {
		return situacaoDao.listarSituacao();	
	}
	
	
}
