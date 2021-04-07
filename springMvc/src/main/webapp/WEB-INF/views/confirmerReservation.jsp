<%@ include file="header.jsp"%>

<a href="logout"><button>Logout</button></a>
<a href="confirmRegister"><button>Confirmer inscription</button></a>
<a href="confirmerReservation"><button>Confirmer Reservation</button></a>
<a href="typeReservation"><button>Déterminer nombre de place</button></a>

<h4 class="form-header">confirmReservation</h4>

<div class="forms col-md-12 bounceInDown mainContent" data-wow-delay="0.2s">



    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Email</th>
            <th>Telephone</th>
            <th>Type de Reservation</th>
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
                <td>

                    <form action="confirmerRes" method="post">
                        <input type="hidden" value="${resevation.idReservation}" name="id">
                        <input type="submit" value="confirmer"/>
                    </form>


                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>