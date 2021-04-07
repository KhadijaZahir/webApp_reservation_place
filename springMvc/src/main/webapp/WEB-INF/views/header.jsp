<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation de place</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
		$(function () {
			$("#datepicker").datepicker();
		});
	</script>

</head>
<body>

	<header class="header">
		<nav class="navbar bg-dark">
			<img src="${pageContext.request.contextPath}/resources/img/logo.jpg"
				alt="logo" class="logo" />

			<img src="<c:out value="${pageContext.request.contextPath}/resources/img/logo.jpg"/>" alt="logo">
			 <img
				src="/resources/img/ogo.jpg" alt="logo-bde">

		</nav>

	</header>