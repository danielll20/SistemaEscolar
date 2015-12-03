/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.sistemaescolar.annotations.Public;
import br.com.sistemaescolar.modelo.Usuario;
import br.com.sistemaescolar.service.UsuarioService;

/**
 * @author Daniel Correia
 * @since 13/10/2015
 *
 */
@Controller
public class LoginController {

	@Inject 
	private Result result;
	
	@Inject
	private UsuarioService UsuarioService;
	
	@Inject
	private Validator validator;
	
	@Inject
	private UsuarioLogado usuarioLogado;
	
	@Path("/") @Public
    public void login() {        
    }
	
	@Post @Public
	public void autentica(Usuario usuario) {
		if(!UsuarioService.existe(usuario)) {
			validator.add(new I18nMessage("login", "Teste"));
			validator.onErrorUsePageOf(this).login();
		}
		
		usuarioLogado.setUsuario(usuario);
		result.redirectTo(InicioController.class).inicio();
	}
	
	@Path("/login/logout")
	public void logout() {
		usuarioLogado.logout();
	    result.redirectTo(this).login();
	}
}
