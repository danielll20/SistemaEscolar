<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" href="${url}/css/style.css"/>
<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
<link rel="stylesheet" href="${url}/css/bootstrap.css"/>
<link rel="stylesheet" href="${url}/css/login.css"/>
<title>Login</title>
</head>
<body>

	<div class="container">
	
<%-- 	<c:forEach items="errors" var="erro"> --%>
<%-- 		${erro.category} - ${erro.message} <br/> --%>
<%-- 	</c:forEach> --%>
	
      <form class="form-signin" action="${url}/login/autentica" method="post">
      	<h2 class="form-signin-heading">Sistema Escolar Web</h2>
      	<br/>
        <h4 class="form-signin-heading">Login</h4>
        
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" name="usuario.email" class="form-control" placeholder="Email" required autofocus>
        
        <label for="inputPassword" class="sr-only">Password</label><br/>
        <input type="password" name="usuario.senha" id="inputPassword" class="form-control" placeholder="Senha" required>
        
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Lembrar minha senha
          </label>
        </div>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      </form>

    </div> <!-- /container -->
</body>
</html>