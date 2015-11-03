<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="form-group">
	<label class="col-sm-2 control-label" for="nome">Aluno:</label>
	<div class="col-sm-5">
		<select class="selectBox" name='matricula.aluno.id' id='matricula.aluno.id'>
			<option id="curso">Selecione um Aluno</option>
			<c:forEach items='${alunos}' var='aluno'>
				<option value='${aluno.id}'
					${aluno.id == matricula.aluno.id ? 'selected' : ''}>${aluno.nome}</option>
			</c:forEach>
		</select>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="turma">Turma:</label>
	<div class="col-sm-5">
		<select class="selectBox" name='matricula.turma.id' id='matricula.turma.id'>
			<option id="curso">Selecione uma Turma</option>
			<c:forEach items='${turmas}' var='turma'>
				<option value='${turma.id}'
					${turma.id == matricula.turma.id ? 'selected' : ''}>${turma.nome}</option>
			</c:forEach>
		</select>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="valorMatricula">Valor da Matr�cula:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="valorMatricula" name="matricula.valorMatricula"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="qntMeses">Quantidade de Meses:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="qntMeses" name="matricula.qntMeses"/>
	</div>
</div>



<div class="form-group">
	<label class="col-sm-2 control-label" for="valorTotal">Valor Total:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="valorTotal" name="matricula.valorTotal"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="dataMatricula">Data da Matr�cula:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="dataMatricula" name="matricula.dataMatricula" readonly="true"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="situacao">Situa��o:</label>
	<div class="col-sm-5">
		<select class="selectBox" name='matricula.situacao.id' id='matricula.situacao.id'>
			<option id="curso">Selecione a situa��o do aluno</option>
			<c:forEach items='${listaSituacao}' var='situacao'>
				<option value='${situacao.id}'
					${situacao.id == matricula.situacao.id ? 'selected' : ''}>${situacao.descricao}</option>
			</c:forEach>
		</select>
	</div>
</div>
