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
<form action="<c:url value='/turma/adiciona'/>" method="post">
		<label for="nome">Nome da Turma:</label>
		<input type="text" id="nome" name="turma.nome" /><br />	
		
		<label for="curso">Curso:</label>
		<input type="text" id="curso" name="turma.curso.nome" /><br />	
		
		<label for="dataInicio">Data de Início:</label>
		<input type="text" id="dataInicio" name="turma.dataInicioe" /><br />	
		
		<label for="dataFim">Data de Término:</label>
		<input type="text" id="dataFim" name="turma.dataFim" /><br />	
		
		<label for="horarioEntrada">Hora de Entrada:</label>
		<input type="text" id="horarioEntrada" name="turma.horarioEntrada" /><br />	
		
		<label for="horarioSaida">Hora de Saída:</label>
		<input type="text" id="horarioSaida" name="turma.horarioSaida" /><br />	
		
		<label for="cargaHoraria">Carga Horária:</label>
		<input type="text" id="cargaHoraria" name="turma.cargaHoraria" /><br />	
		
		<label for="numeroVagas">Vagas:</label>
		<input type="text" id="numeroVagas" name="turma.numeroVagas" /><br />		
			
		<input type="submit" value="Salvar" />
	</form>

</body>
</html>