<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<c:url value='/instituicao/adiciona'/>" method="post">
		<label for="cnpj">CNPJ:</label>
		<input type="text" id="cnpj" name="instituicao.cnpj" /><br />	
		
		<label for="razaoSocial">Razão Social:</label>
		<input type="text" id="razaoSocial" name="instituicao.razaoSocial" /><br />	
		
		<label for="nomeFantasia">Nome Fantasia:</label>
		<input type="text" id="nomeFantasia" name="instituicao.nomeFantasia" /><br />
		
		<label for="rua">Rua:</label>
		<input type="text" id="rua" name="instituicao.endereco.rua" /><br />
		
		<label for="numero">Número:</label>
		<input type="text" id="numero" name="instituicao.endereco.numero" /><br />
		
		<label for="coplemento">Complemento:</label>
		<input type="text" id="complemento" name="instituicao.endereco.complemento" /><br />
		
		<label for="bairro">Bairro:</label>
		<input type="text" id="bairro" name="instituicao.endereco.bairro" /><br />
		
		<label for="telefone">Telefone:</label>
		<input type="text" id="telefone" name="instituicao.endereco.telefone" /><br />
			
		<input type="submit" value="Salvar" />
	</form>

</body>
</html>