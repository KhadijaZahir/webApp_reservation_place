<%@ include file="header.jsp"%>


<h4 class="form-header">historique</h4>

<div class="forms col-md-12 bounceInDown mainContent" data-wow-delay="0.2s">



    <table class="table table-striped">
        <thead>
        <tr>
            <th>Date</th>
            <th>Reservation type</th>
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