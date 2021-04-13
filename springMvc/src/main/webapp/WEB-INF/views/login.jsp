<%@ include file="header.jsp"%>

<section class="ftco-section">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-7 col-lg-5">
				<div class="login-wrap p-4 p-md-5">
					<h3 class="text-center mb-4">S'inscrire pour reserver votre place</h3>

					<form action="Account" method="post" class="login-form">
						<div class="form-group">
							<input type="text" name="email" class="form-control rounded-left" placeholder="Email" required>
						</div>
						<div class="form-group d-flex">
							<input type="password" name="password" class="form-control rounded-left" placeholder="Mot de passe" required>
						</div>
						<div class="form-group">
							<button type="submit" class="form-control btn btn-primary rounded submit">se connecter</button>
						</div>
<%--						<div class="form-group d-md-flex">--%>
							<div class="text-center mb-4">
								<a href="register">Creer un compte</a>
							</div>
<%--						</div>--%>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div>
		<c:if test="${not empty error}">
			Error: ${error}
		</c:if>
	</div>

</section>





</body>

</html>