/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.InstituicaoDao;
import br.com.sistemaescolar.modelo.Instituicao;

/**
 * @author Leonardo Ribeiro
 * @since 24/10/2015
 */
public class InstituicaoService {
	
	@Inject
	private InstituicaoDao instituicaoDao;
	
	public void insert(Instituicao instituicao) {
		instituicaoDao.insert(instituicao);
	}
	
	public List<Instituicao> listarTodos() {
		return instituicaoDao.lstarTodos();
	}
	
	public Instituicao buscaPorId( Long id) {
		return instituicaoDao.buscarPorId(id);
	}
	
	public void remove(Instituicao instituicao) {
		instituicaoDao.delete(instituicao);
	}
	
	public void atualizar(Instituicao instituicao) {
		instituicaoDao.update(instituicao);
	}

}
