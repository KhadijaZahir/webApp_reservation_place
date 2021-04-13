<%@ include file="header.jsp" %>
<div class="container">
    <div class="row justify-content-center">
        <h3 class="text-center m-5">Inscrez-vous pour reserver votre place durant le week-end et/ ou durant les heures après 17h</h3>

        <div class="col-md-7 col-lg-5">
            <div class="login-wrap p-4">
                <form modelAttribute="user" action="registerProcess" method="POST" class="login-form">
                    <div class="form-group">
                        <input class="form-control rounded-left" name="nom" type="text" placeholder="nom"
                               required="true"/>
                    </div>
                    <div class="form-group">
                        <input class="form-control rounded-left" name="prenom" type="text" placeholder="prenom"
                               required="true"/>
                    </div>
                    <div class="form-group">
                        <input class="form-control rounded-left" name="email" type="email" pattern="[A-Za-z0-9._%+-]+@[student]+\.+[youcode]+\.+[a-z]{2,}$" placeholder="email"
                               required="true"/>

                    </div>
                    <div class="form-group">
                        <input class="form-control rounded-left" name="phone" type="number" pattern="[0]{1}[6-7]{1}[0-9]{8}" placeholder="phone"
                               required="true"/>

                    </div>
                    <div class="form-group">
                        <input class="form-control rounded-left" name="password" type="text" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}" placeholder="passWord" required="true"/>

                    </div>
                    <div class="form-group">
<%--                        <button type="submit">submit</button>--%>
                        <button type="submit" class="form-control btn btn-primary rounded submit">Se connecter</button>

                    </div>

                    <%--    [0]{1}[6-7]{1}[0-9]{8}--%>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>