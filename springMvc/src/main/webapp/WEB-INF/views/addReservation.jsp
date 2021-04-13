<%@ include file="header.jsp" %>

<div class="mt-5 ml-3">
    <h4 class="form-header">Dashboard Apprenant</h4>

    <a href="logout">
        <button class="btn btn-primary btn-lg float-right mr-3">Se deconnecter</button>
    </a>
    <a href="addResBut">
        <button class="btn btn-primary btn-lg">Ajouter Reservation</button>
    </a>
    <a href="historicReservation">
        <button class="btn btn-primary btn-lg">Historique des Reservation</button>
    </a>
</div>


<div class="container">
    <h3 class="text-center m-4">Reserver votre place</h3>

    <div class="row justify-content-center">

        <div class="col-md-7 col-lg-5">
            <div class="login-wrap p-4">

                <form class="login-form" method="post" action="reservation">
                    <%--            <label for="datepicker">Date</label>--%>
                    <%--                <input type="date" name="datedate" id="datepicker">--%>
                    <div class="form-group m-2">
                        <label>Date : </label>
                        <input class="form-control rounded" type="date" name="datedate">
                    </div>
                    <div class="form-group m-2">
                        <label>Type de Reservation : </label>
                        <select class="form-control rounded" name="category">
                            <c:forEach items="${listTr}" var="category">
                                <option>${category.nom}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group m-2">
                        <button class="form-control btn btn-primary rounded submit" type="submit" value="Confirmer">
                            Confirmer
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>