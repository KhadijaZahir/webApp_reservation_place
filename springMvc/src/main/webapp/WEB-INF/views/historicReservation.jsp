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


<div class="forms col-md-12 bounceInDown mainContent mt-5" data-wow-delay="0.2s">

    <table class="table table-striped">
        <thead class="bg-primary text-white">
        <tr>
            <th>Date</th>
            <th>Type de Reservation</th>
            <th>Confirmation</th>
        </tr>
        </thead>
        <tbody>
                   <c:forEach items="${listR}"  var="listR">
                <tr class="">
                    <td>${listR.datereservation}</td>
                    <td>${listR.typereservationByIdTypereseervtaion.nom}</td>
                    <td>${listR.confirmerreservation}</td>
                                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>