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
	<form action="<c:url value='/aluno/adiciona'/>" method="post">
		<label for="nome">Nome:</label>
		<input type="text" id="nome" name="aluno.nome" /><br />	
		
		<label for="rua">Endereço:</label>
		<input type="text" id="rua" name="aluno.endereco.rua" /><br />	
		
		<label for="numero">Número:</label>
		<input type="text" id="numero" name="aluno.endereco.numero" /><br />
		
		<label for="complemento">Complemento:</label>
		<input type="text" id="complemento" name="aluno.endereco.complemento" /><br />
		
		<label for="bairro">Bairro:</label>
		<input type="text" id="bairro" name="aluno.endereco.bairro" /><br />
		
		<label for="nomeMae">Nome da mãe:</label>
		<input type="text" id="nomeMae" name="aluno.nomeMae" /><br />
		
		<label for="nomePai">Nome do pai:</label>
		<input type="text" id="nomePai" name="aluno.nomePai" /><br />
		
		<label for="dataNascimento">Data de nascimento:</label>
		<input type="text" id="dataNascimento" name="aluno.dataNascimento" /><br />			
		
		<label for="dataCadastro">Data do cadastro:</label>
		<input type="text" id="dataCadastro" name="aluno.dataCadastro" /><br />
			
		<label for="sexo">Sexo:</label>
		<input type="text" id="sexo" name="aluno.sexo" /><br />
		
		<label for="cpf">CPF:</label>
		<input type="text" id="cpf" name="aluno.cpf" /><br />
		
		<label for="rg">RG:</label>
		<input type="text" id="rg" name="aluno.rg" /><br />
		
		<label for="ufRg">UF RG:</label>
		<input type="text" id="ufRg" name="aluno.ufRG" /><br />
		
		<label for="telResidencial">Tel residêncial:</label>
		<input type="text" id="telResidencial" name="aluno.telefone" /><br />
		
		<label for="celular">Tel celular:</label>
		<input type="text" id="celular" name="aluno.celular" /><br />
			
		<input type="submit" value="Salvar" />
	</form>
</body>
</html>