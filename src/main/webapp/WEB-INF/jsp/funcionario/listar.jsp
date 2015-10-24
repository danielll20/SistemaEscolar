<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="url" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
  <head>
    <title>Lista de Funcion�rios</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    <link rel="stylesheet" href="${url}/css/style.css"/>
	<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
	<link rel="stylesheet" href="${url}/css/bootstrap.css"/>
    		
  </head>
  <body class="body">
    <jsp:include page="../layout/menu.jsp"></jsp:include>
	<h3>Lista de Funcion�rios</h3>
    
    
	<table class="table table-stripped table-hover table-bordered">		
		<thead>						  
		  <tr>		            
		    <th>Nome</th>
		    <th>CPF</th>
		    <th>Cargo</th>          
		    <th>A��es</th>
		  </tr>
		</thead>
      
		<tbody>
		  	<c:forEach items="${listaFuncionarios}" var="funcionario">
		     <tr>		       
		 	   <td>${funcionario.nome}</td>
		       <td>${funcionario.cpf}</td>
		       <td>${funcionario.cargo}</td>          
		       <td>
		         <a href="${url}/funcionario/${funcionario.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar funcion�rio"/></a>
		         <a href="${url}/funcionario/delete/${funcionario.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir funcion�rio"/></a>
		       </td>
		     </tr>
		   </c:forEach>
		</tbody>
	</table>	
	           
   </body>      
</html>
 