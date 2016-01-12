/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.SexoDao;
import br.com.sistemaescolar.modelo.Sexo;

/**
 * @author Daniel Correia
 * @since 12/01/2016
 *
 */
public class SexoService {

	@Inject
	private SexoDao sexoDao;
	
	public List<Sexo> listar() {
		return sexoDao.listar();
	}
}
