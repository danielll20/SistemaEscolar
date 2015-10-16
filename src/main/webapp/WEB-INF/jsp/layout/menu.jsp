<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
<link rel="stylesheet" href="<c:url value="/css/jquery-ui.css"/>">
<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">

<script type="text/javascript" src="<c:url value="/js/bootstrap.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>" ></script>
 

<title>Insert title here</title>
</head>
<body role="document">
	<nav class="navbar navbar-default">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Sistema Escolar</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="#">Início</a></li>
              
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cadastro <span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="<c:url value="/aluno/novo"/>">Aluno</a></li>
                  <li><a href="#">Disciplina</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>              
              <li><a href="#">Relatórios</a></li>       
              <li class="logoff"><a href="#contact">Sair</a></li>                                      
              <li class="textoUsuario">Bem vindo: Usuário.</li>    
                                    
            </ul>
          </div><!--/.nav-collapse -->          
        </div>        
      </nav>      
</body>
</html>