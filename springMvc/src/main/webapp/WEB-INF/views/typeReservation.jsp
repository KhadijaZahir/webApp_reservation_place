<%@ include file="header.jsp"%>

<div id="warepper">
    <div id="header">
        <h2>List of Type Reservation</h2>

    </div>
</div>
<div is="container">
    <div>
        <form action="Addtype" method="post">
            <label>Type Reservation :  </label>
            <input type="text" name="typeRes">
            <label>Number of places : </label>
            <input type="text" name="nomberPlaces">
            <label>Date : </label>
            <input type="date" name="datenbplace">
            <input type="submit">
        </form>
    </div>
    <div id="content">

        <table>
            <tr>
                <th>Type Reservation</th>
                <th>Number of places</th>
                <th>Date</th>
                <th>Action</th>

            </tr>
            <c:forEach var="typeR" items="${typeRe}">


                <tr>
                    <td>${ typeR.nom }</td>
                    <td>${ typeR.nbapprenant }</td>
                    <td>${ typeR.datenbplace }</td>
                    <td>
                        <form action="deleteType" method="post">
                            <input type="hidden" value="${typeR.idTypereseervtaion}" name="id" /> <input
                                type="submit" value="Delete" />
                        </form>
<%--                        <form action="DispalyEditType" method="post">--%>
<%--                            <input type="hidden" value="${typeR.idTypereseervtaion}" name="id" /> <input--%>
<%--                                type="submit" value="update" />--%>
<%--                        </form>--%>
                    </td>

                </tr>

            </c:forEach>


        </table>

    </div>
</div>
</body>
</html>