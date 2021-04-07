<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>

<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>--%>
<%--<html>--%>

<%--<head>--%>
<%--    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">--%>
<%--    <title>Registration</title>--%>
<%--</head>--%>

<%--<body>--%>
<%--<form:form id="regForm" modelAttribute="student" action="registerProcess" method="post">--%>

<%--    <table align="center">--%>
<%--        <tr>--%>
<%--            <td>--%>
<%--                <form:label path="password">Password</form:label>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <form:password path="password" name="password" id="password" />--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>--%>
<%--                <form:label path="nom">FirstName</form:label>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <form:input path="nom" name="nom" id="firstname" />--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>--%>
<%--                <form:label path="prenom">LastName</form:label>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <form:input path="prenom" name="prenom" id="prenom" />--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>--%>
<%--                <form:label path="email">Email</form:label>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <form:input path="email" name="email" id="email" />--%>
<%--            </td>--%>
<%--        </tr>--%>

<%--        <tr>--%>
<%--            <td>--%>
<%--                <form:label path="phone">Phone</form:label>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <form:input path="phone" name="phone" id="phone" />--%>
<%--            </td>--%>
<%--        </tr>--%>

<%--        <tr>--%>
<%--            <td></td>--%>
<%--            <td>--%>
<%--                <form:button id="register" name="register">Register</form:button>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr></tr>--%>
<%--        <tr>--%>
<%--            <td></td>--%>
<%--            <td><a href="home.jsp">Home</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>

<%--</body>--%>

<%--</html>--%>

<%@ include file="header.jsp"%>

<form modelAttribute="user" action="registerProcess" method="POST">
    <li><a href="${pageContext.request.contextPath}"><span>Frontpage</span></a></li>
    <input name="nom" type="text" placeholder="nom"/>
    <input name="prenom" type="text" placeholder="prenom"/>
    <input name="email" type="email" placeholder="email" required="true" requiredMessage="La saisie du email est obligatoire !" />
    <input name="phone" type="number" placeholder="phone" required="true" requiredMessage="La saisie du N de tele est obligatoire !" />
    <input name="password" type="text" pattern="^(?=.*[8-16])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()�[{}]:;',?/*~$^+=<>]).{8,20}$
" placeholder="passWord" required="true" requiredMessage="La saisie du mot de passe est obligatoire !" />
    <button type="submit">submit</button>
<%--    [0]{1}[6-7]{1}[0-9]{8}--%>
</form>
</body>
</html>