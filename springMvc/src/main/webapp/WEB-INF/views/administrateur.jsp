<%@ include file="header.jsp"%>

<a href="logout"><button>Logout</button></a>
<a href="confirmRegister"><button>Confirmer inscription</button></a>
<a href="confirmerReservation"><button>Confirmer Reservation</button></a>
<a href="typeReservation"><button>Déterminer nombre de place</button></a>



<h4 class="form-header">Administrateur</h4>

<div class="forms col-md-12 bounceInDown mainContent" data-wow-delay="0.2s">



 <table class="table table-striped">
  <thead>
  <tr>
   <th>Nom</th>
   <th>Prenom</th>
   <th>Email</th>
   <th>Téléphone</th>
   <th>Confirmation</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${student}"  var="student">
   <tr class="">
    <td>${student.nom}</td>
    <td>${student.prenom}</td>
    <td>${student.email}</td>
    <td>${student.phone}</td>
    <td>

     <form action="confirmer" method="post">
      <input type="hidden" value="${student.idUser}" name="id">
      <input type="submit" value="confirmer"/>
     </form>
     <form action="rejeter" method="post">
      <input type="hidden" value="${student.idUser}" name="id">
      <button>rejeter</button>
     </form>

    </td>
   </tr>
  </c:forEach>
  </tbody>
 </table>
</div>