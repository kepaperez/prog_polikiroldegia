<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.bean.Actividad" %>

	<%
	Actividad actividad = (Actividad)request.getAttribute("actividad");
	%>



<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container mt-5 rounded border border-dark">
		<div class="row">
			<div class="col">
				<h1 class="text-center">Actividadearen izena</h1>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Fecha Inicio</div>
			<div class="col text-center font-weight-bold"><%=actividad.getFecha_inicio()%></div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Dias Semana</div>
			<div class="col text-center font-weight-bold"><%=actividad.getDias() %></div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Horas</div>
			<div class="col text-center font-weight-bold"><%=actividad.getHoras() %></div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Max Participantes</div>
			<div class="col text-center font-weight-bold"><%=actividad.getMaxParticipantes() %></div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Precio</div>
			<div class="col text-center font-weight-bold"><%=actividad.getPrecio() %></div>
		</div>
		<br>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold" href="EditarActividad?id=<%=actividad.getId() %>"><button type="button" class="btn btn-primary">Editar</button></div>
			<div class="col text-center font-weight-bold"><button type="button" class="btn btn-danger">Borrar</button></div>
		</div>
		
		<div class="row mt-3">
			<div class="col ">
			
			</div>
			<a href="VerActividades" class="btn btn-primary">Ver actividades</a>
		</div>
		
		
		<br>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>