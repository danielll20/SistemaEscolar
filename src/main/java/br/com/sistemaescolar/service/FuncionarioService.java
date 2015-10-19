/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.FuncionarioDao;
import br.com.sistemaescolar.modelo.Funcionario;

/**
 @author Leonardo Ribeiro 
 * @since 19/10/2015
 */
public class FuncionarioService {
	
	@Inject
	private FuncionarioDao funcionarioDao;
	
	public void insert(Funcionario funcionario) {
		funcionarioDao.insert(funcionario);
	}

}
