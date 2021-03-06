/**
 * 
 */
package br.com.sistemaescolar.interceptor;

import javax.inject.Inject;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.sistemaescolar.annotations.Public;
import br.com.sistemaescolar.controller.LoginController;
import br.com.sistemaescolar.controller.UsuarioLogado;

/**
 * @author Daniel Correia
 * @since 03/12/2015
 *
 */
@Intercepts
public class AutorizadorInterceptor {

	@Inject private UsuarioLogado usuarioLogado;
	@Inject private Result result;
	@Inject private ControllerMethod controllerMethod;
	
	@Accepts
	public boolean accepts() {
		return !controllerMethod.containsAnnotation(Public.class);
	}
	
	@AroundCall
	public void intercepta(SimpleInterceptorStack stack) {
		if(usuarioLogado.getUsuario() == null) {
			result.redirectTo(LoginController.class).login();
			return;
		}
		stack.next();
	}
}
