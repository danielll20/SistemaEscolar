<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<c:set var="url" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${url}/css/style.css" />
<link rel="stylesheet" href="${url}/css/jquery-ui.css" />
<link rel="stylesheet" href="${url}/css/bootstrap.css" />
<title>Início</title>
</head>
<body class="body">
<jsp:include page="../layout/menu.jsp"></jsp:include>
<div class="conteudoInicio">
	<h1>${listarInstituicao}</h1>	
</div>
</body>
</html>