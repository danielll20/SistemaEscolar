/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.InstituicaoDao;

/**
 * @author Daniel Correia
 * @since  20/10/2015
 *
 */
public class InicioService {
	
	@Inject
	private InstituicaoDao instituicaoDao;

	public String listarInstituicaoPorNomeFantasia() {		
		return instituicaoDao.listarInstituicaoPorNomeFantasia();		
	}

}
