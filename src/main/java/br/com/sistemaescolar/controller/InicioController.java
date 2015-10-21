/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.service.InicioService;

/**
 * @author Daniel Correia
 * @since  20/10/2015
 *
 */
@Controller
public class InicioController {

	@Inject
	private Result result;
	
	@Inject
	private InicioService inicioService;
	
	@Get("/inicio/inicio")
	public void inicio() {		
		result.include("listarInstituicao", inicioService.listarInstituicao());
	}
}
