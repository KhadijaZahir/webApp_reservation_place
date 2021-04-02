<%@ include file="header.jsp"%>

<form action="Account" method="post">
	<div>
		<label>Email : </label> <input type="email" name="email"
			class="form-control" /> <label>Password : </label> <input
			type="password" name="pass" class="form-control" /> <input
			type="submit" class="btn btn-block btn-primary" value="se connecter"/>

		<div class="d-flex mb-5 align-items-center">
			<a href="register" class="signup-image-link">Créer un compte</a>
		</div>
	</div>

</form>
</body>

</html>