/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

/**
 * @author Daniel Correia
 * @since 13/10/2015
 *
 */
@Controller
public class LoginController {

	@Inject 
	private Result result;
	
	@Path("/")
    public void login() {        
    }
}
