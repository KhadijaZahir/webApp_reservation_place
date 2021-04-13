<%@ include file="header.jsp"%>

<div class="mt-5 ml-3">
    <h4 class="form-header">Dashboard d'aministrateur</h4>

    <a href="logout"><button class="btn btn-primary btn-lg float-right mr-3">Se deconnecter</button></a>
    <a href="confirmRegister"><button class="btn btn-primary btn-lg">Confirmer inscription</button></a>
    <a href="confirmerReservation"><button class="btn btn-primary btn-lg">Confirmer Reservation</button></a>
    <a href="typeReservation"><button class="btn btn-primary btn-lg">Determiner nombre de place</button></a>
</div>



<div class="forms col-md-12 bounceInDown mainContent mt-5" data-wow-delay="0.2s">

    <table class="table table-striped">
        <thead class="bg-primary text-white">
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Email</th>
            <th>Telephone</th>
            <th>Type de Reservation</th>
            <th>déja Confirmer</th>
            <th>Confirmation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${resevation}"  var="resevation">
            <tr class="">
                <td>${resevation.utilisateur.nom}</td>
                <td>${resevation.utilisateur.prenom}</td>
                <td>${resevation.utilisateur.email}</td>
                <td>${resevation.utilisateur.phone}</td>
                <td>${resevation.typereservationByIdTypereseervtaion.nom}</td>
                <td>${resevation.confirmerreservation}</td>

                <td>

                    <form action="confirmerRes" method="post">
                        <input type="hidden" value="${resevation.idReservation}" name="id">
                        <button class="btn btn-primary rounded" type="submit" value="confirmer">confirmer</button>

                    </form>


                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>