<div class="form-group">
	<label class="col-sm-2 control-label" for="nome">Nome da Turma:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="nome" name="turma.nome"
			value="${turma.nome}" />
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="nome">Curso:</label>
	<div class="col-sm-5">
		<select class="selectBox" name='turma.curso.id' id='turma.curso.id'>
			<option id="curso">Selecione um curso</option>
			<c:forEach items='${cursos}' var='curso'>
				<option value='${curso.id}'
					${curso.id == turma.curso.id ? 'selected' : ''}>${curso.nome}</option>
			</c:forEach>
		</select>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="dataInicio">Data de
		Início:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="dataInicio"
			name="turma.dataInicio" value="${turma.dataInicio}" />
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="dataFim">Data de
		Término:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="dataFim"
			name="turma.dataFim" value="${turma.dataFim}" />
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="horarioEntrada">Hora
		de Entrada:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="horarioEntrada"
			name="turma.horarioEntrada" value="${turma.horarioEntrada}" />
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="horarioSaida">Hora
		de Saída:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="horarioSaida"
			name="turma.horarioSaida" value="${turma.horarioSaida}" />
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="cargaHoraria">Carga
		Horária:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="cargaHoraria"
			name="turma.cargaHoraria" value="${turma.cargaHoraria}" />
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="numeroVagas">Vagas:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="numeroVagas"
			name="turma.numeroVagas" value="${turma.numeroVagas}" />
	</div>
</div>
