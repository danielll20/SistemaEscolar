<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<c:set var="url" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${url}/css/style.css"/>
<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
<link rel="stylesheet" href="${url}/css/bootstrap.css"/>
<title>Cadastrar Instituição</title>
</head>
<body class="body">
<jsp:include page="../layout/menu.jsp"></jsp:include>
	 <h3>Cadastro de Instituição</h3>
    <br><br> 
<form action="${url}/instituicao/adiciona" method="post" class="form-horizontal">
		<%@include file="../instituicao/form-inputs.jsp" %>		
		<div class="botoes">
			<input type="submit" value="Salvar" class="btn btn-primary"/>
			<input type="reset" value="Cancelar" class="btn btn-primary"/>					
		</div>		
	</form>
    <br>
</body>
</html>