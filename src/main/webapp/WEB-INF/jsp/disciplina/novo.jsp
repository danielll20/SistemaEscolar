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
<form action="<c:url value='/disciplina/adiciona'/>" method="post">
		<label for="nome">Nome:</label>
		<input type="text" id="nome" name="disciplina.nome" /><br />	
		
		<label for="cargaHoraria">Carga Horária:</label>
		<input type="text" id="cargaHoraria" name="disciplina.cargaHoraria" /><br />	
		
		
		
		<select name ="disciplina.professores"size ="1">
		<option value ="">Professor desta disciplina</option>
		</select>
		
		<input type="submit" value="Salvar" />
	</form>

</body>
</html>