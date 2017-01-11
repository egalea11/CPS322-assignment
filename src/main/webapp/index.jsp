<%@ page import="cps3222.classes.*" %>
<%@ page session="true" %>


<html>
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
  <link rel="stylesheet" href="css/style.css">
</head>

  <body>
	<div class="login">
		<div class="login-screen">

			<div class="area">
				<form action="login" method="GET" name="loginpls">
					<div class="control-group">
						<input type="text" class="login-field" value="" placeholder="username" id="login-name" name="id">
						<label class="login-field-icon fui-user" for="login-name"></label>
					</div>
					<div class="control-group">
						<input type="password" class="login-field" value="" placeholder="password" id="login-pass" name="password">
						<label class="login-field-icon fui-lock" for="login-pass"></label>
					</div>

					<input class="btn btn-primary btn-large btn-block" type="submit" value="login" name="login-btn"/>
				</form>

                <p><%= session.getAttribute("errormsg") %></p>

            </div>

		</div>
	</div>
</body>

</html>