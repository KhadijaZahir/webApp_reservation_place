<%@ include file="header.jsp"%>

<div class="mt-5 ml-3">
    <h4 class="form-header">Dashboard Administrateur</h4>

    <a href="logout"><button class="btn btn-primary btn-lg float-right mr-3">Se deconnecter</button></a>
    <a href="confirmRegister"><button class="btn btn-primary btn-lg">Confirmer inscription</button></a>
    <a href="confirmerReservation"><button class="btn btn-primary btn-lg">Confirmer Reservation</button></a>
    <a href="typeReservation"><button class="btn btn-primary btn-lg">Determiner nombre de place</button></a>
</div>



<div class="container mt-5">
    <div>
        <form action="Addtype" method="post" class="form-inline">
            <label>Type de Reservation :   </label>
            <input type="text" name="typeRes" class="form-control rounded ml-2">
            <label>Nombres de places :   </label>
            <input type="text" name="nomberPlaces" class="form-control rounded ml-2">
            <label>Date :   </label>
            <input type="date" name="datenbplace" class="form-control rounded ml-2">
            <input type="submit" value="Enregistrer" class="form-control btn btn-primary rounded submit ml-2">
        </form>
    </div>
    <div>

        <table class="table table-striped mt-5">
            <thead class="bg-primary text-white">
               <tr>
                <th>Type de Reservation</th>
                <th>Nombres des places</th>
                <th>Date</th>
                <th>Confirmation</th>

                </tr>
            </thead>
            <c:forEach var="typeR" items="${typeRe}">


                <tr>
                    <td>${ typeR.nom }</td>
                    <td>${ typeR.nbapprenant }</td>
                    <td>${ typeR.datenbplace }</td>
                    <td>
                        <form action="deleteType" method="post">
                            <input type="hidden" value="${typeR.idTypereseervtaion}" name="id" />
                            <button class="btn btn-primary rounded" type="submit" value="Supprimer">Supprimer</button>

                        </form>
                    </td>

                </tr>

            </c:forEach>


        </table>

    </div>
</div>
</body>
</html>