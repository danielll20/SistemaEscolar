<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="url" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
  <head>
    <title>Lista de Cursos</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    <link rel="stylesheet" href="${url}/css/style.css"/>
	<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
	<link rel="stylesheet" href="${url}/css/bootstrap.css"/>
    		
  </head>
  <body class="body">
    <jsp:include page="../layout/menu.jsp"></jsp:include>
	<h3>Lista de Cursos</h3>
    
    
	<table class="table table-stripped table-hover table-bordered">		
		<thead>						  
		  <tr>		            
		    <th>Nome</th>
		    <th>Falta atribuição de disciplina</th>	  
		    <th>Ações</th>  
		  </tr>
		</thead>
      
		<tbody>
		  	<c:forEach items="${listaCursos}" var="curso">
		     <tr>		       
		 	   <td>${curso.nome}</td>
		 	   <td>${curso.valorMatricula}</td>              
		       <td>
		         <a href="${url}/curso/${curso.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar curso"/></a>
		         <a href="${url}/curso/delete/${curso.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir curso"/></a>
		       </td>
		     </tr>
		   </c:forEach>
		</tbody>
	</table>	
	           
   </body>      
</html>