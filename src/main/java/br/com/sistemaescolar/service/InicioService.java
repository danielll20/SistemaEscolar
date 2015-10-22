/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import br.com.sistemaescolar.dao.InstituicaoDao;
import br.com.sistemaescolar.modelo.Instituicao;

/**
 * @author Daniel Correia
 * @since  20/10/2015
 *
 */
public class InicioService {
	
	@Inject
	private InstituicaoDao instituicaoDao;

	public Instituicao listarInstituicaoPorNomeFantasia() {				
		Instituicao instituicao = null;
		
		try {
			instituicao = instituicaoDao.listarInstituicaoPorNomeFantasia();
		} catch (NoResultException nr) {			
		}
				
		if(instituicao == null || instituicao.getNomeFantasia().equals("")) {
			instituicao = new Instituicao();
			instituicao.setNomeFantasia("Por favor cadastre sua instituição.");
		}
		
		return instituicao;
		
	}

}
