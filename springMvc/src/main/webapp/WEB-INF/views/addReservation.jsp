<%@ include file="header.jsp"%>

<h1>Add Reservation</h1>
<form method="post" action="reservation">
    <%--            <label for="datepicker">Date</label>--%>
    <%--                <input type="date" name="datedate" id="datepicker">--%>
    <label>Date</label>
    <input type="date" name="datedate">

    <label>Type Reservation</label>
    <select name="category">
        <c:forEach items="${listTr}" var="category">
            <option>${category.nom}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Confirmer">
</form>
</body>
</html>