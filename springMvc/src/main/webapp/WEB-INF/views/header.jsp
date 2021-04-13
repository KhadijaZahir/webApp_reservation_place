<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reservation de place</title>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">--%>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<header class="header">
    <nav class="navbar bg-dark p-0">
        <%--			<h1 class="text-white">You<span class="text-primary">Code</span></h1>--%>
        <div class="col-md-3 col-lg-2">
				<img class="float-left w-100" src="${pageContext.request.contextPath}/resource/img/logo.jpg"
                 alt="logo"/>
        </div>
        <div class="col-md-2 col-lg-1">
            <img class="float-right w-75" src="<c:out value="${pageContext.request.contextPath}/resource/img/img.png"/>" alt="logo_bde">
        </div>


    </nav>

</header>