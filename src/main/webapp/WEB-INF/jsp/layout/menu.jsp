<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
<link rel="stylesheet" href="<c:url value="/css/jquery-ui.css"/>">
<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">

<script type="text/javascript" src="${url}/js/jquery.js" ></script>
<script type="text/javascript" src="${url}/js/bootstrap.js"/></script>
<script type="text/javascript">
	$('.dropdown-toggle').dropdown();
</script>

 

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
            <a class="navbar-brand" href="${url}/inicio/inicio">Sistema Escolar</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="${url}/inicio/inicio">Início</a></li>
              
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cadastro<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="${url}/aluno/novo">Aluno</a></li>
                  <li><a href="${url}/disciplina/novo">Disciplina</a></li>
                  <li><a href="${url}/funcionario/novo">Funcionário</a></li>
                  <li><a href="${url}/instituicao/novo">Instituição</a></li>
                  <li><a href="${url}/professor/novo">Professor</a></li>
                  <li><a href="${url}/curso/novo">Curso</a></li>
                  <li><a href="${url}/turma/novo">Turma</a></li>
                                    
<!--                   <li role="separator" class="divider"></li> -->
<!--                   <li class="dropdown-header">Nav header</li> -->
<!--                   <li><a href="#">Separated link</a></li> -->
<!--                   <li><a href="#">One more separated link</a></li> -->
                </ul>
              </li> 
              
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Listar<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="${url}/aluno/listar">Alunos</a></li>
                  <li><a href="${url}/disciplina/listar">Disciplinas</a></li>
                  <li><a href="${url}/funcionario/listar">Funcionários</a></li>
                  <li><a href="${url}/instituicao/listar">Instituição</a></li>
                  <li><a href="${url}/professor/listar">Professores</a></li>
                  <li><a href="${url}/curso/listar">Cursos</a></li>
                  <li><a href="${url}/turma/listar">Turmas</a></li>                                    
                </ul>
              </li> 
              
              <li class="active"><a href="${url}/matricula/novo">Matrículas</a></li>
              
               <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pagamentos<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Mensalidade de aluno</a></li>
                  <li><a href="#">Pagamento de professor/funcionário</a></li>                                               
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