<%@ include file="header.jsp"%>

<a href="logout"><button>Logout</button></a>
<a href="confirmRegister"><button>Confirmer inscription</button></a>
<a href="confirmerReservation"><button>Confirmer Reservation</button></a>
<a href=""><button>Déterminer nombre de place</button></a>

<h4 class="form-header">confirmReservation</h4>

<div class="forms col-md-12 bounceInDown mainContent" data-wow-delay="0.2s">



    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Email</th>
            <th>Téléphone</th>
            <th>Type de Réervation</th>
            <th>Confirmation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${reservation}"  var="reservation">
            <tr class="">
                <td>${reservation.nom}</td>
                <td>${reservation.prenom}</td>
                <td>${reservation.email}</td>
                <td>${reservation.phone}</td>
                <td>${reservation.typereservationByIdTypereseervtaion.nom}</td>
                <td>

                    <form action="confirmer" method="post">
                        <input type="hidden" value="${reservation.idUser}" name="id">
                        <input type="submit" value="confirmer"/>
                    </form>


                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>