/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.FuncionarioDao;
import br.com.sistemaescolar.modelo.Funcionario;

/**
 @author Leonardo Ribeiro 
 * @since 24/10/2015
 */
public class FuncionarioService {
	
	@Inject
	private FuncionarioDao funcionarioDao;
	
	public void insert(Funcionario funcionario) {
		funcionarioDao.insert(funcionario);
	}
	
	public List<Funcionario> listarTodos() {
		return funcionarioDao.listarTodos();
	}
	
	public Funcionario buscarPorId(Long id) {
		return funcionarioDao.buscarPorId(id);
	}
	
	public void remove(Funcionario funcionario) {
		funcionarioDao.delete(funcionario);
	}
	
	public void atualizar(Funcionario funcionario) {
		funcionarioDao.update(funcionario);
	}

}
