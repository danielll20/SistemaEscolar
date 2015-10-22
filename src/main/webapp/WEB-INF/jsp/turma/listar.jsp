<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="url" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
  <head>
    <title>Lista de Turmas</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    <link rel="stylesheet" href="${url}/css/style.css"/>
	<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
	<link rel="stylesheet" href="${url}/css/bootstrap.css"/>
    		
  </head>
  <body class="body">
    <jsp:include page="../layout/menu.jsp"></jsp:include>
	<h3>Lista de Turmas</h3>
    
    
	<table class="table table-stripped table-hover table-bordered">		
		<thead>						  
		  <tr>		            
		    <th>Nome</th>
		    <th>Curso</th>
		    <th>Turno</th>
		    <th>Ações</th>		    
		  </tr>
		</thead>
      
		<tbody>
		  	<c:forEach items="${listaTurmas}" var="turma">
		     <tr>		       
		 	   <td>${turma.nome}</td>
		       <td>${turma.curso.nome}</td>	
		        <td>${turma.turno}</td>	              
		       <td>
		         <a href="${url}/turma/${turma.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar turma"/></a>
		         <a href="${url}/turma/delete/${turma.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir turma"/></a>
		       </td>
		     </tr>
		   </c:forEach>
		</tbody>
	</table>	
	           
   </body>      
</html>