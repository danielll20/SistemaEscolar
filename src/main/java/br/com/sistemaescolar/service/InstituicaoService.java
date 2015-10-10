/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.InstituicaoDao;
import br.com.sistemaescolar.modelo.Instituicao;

/**
 * @author Leonardo Ribeiro
 *
 */
public class InstituicaoService {
	
	@Inject
	private InstituicaoDao instituicaoDao;
	
	public void insert(Instituicao instituicao) {
		instituicaoDao.insert(instituicao);
	}

}
