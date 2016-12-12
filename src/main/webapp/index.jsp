<%@ page import="cps3222.classes.*" %>

<%
    AdPlatform adPlatform = new AdPlatform();
    adPlatform.initAffiliates();
%>


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
				<div class="control-group">
				<form action="accountadmin.jsp" method="GET" name="submitpls">
				<input type="text" class="login-field" value="" placeholder="username" id="login-name" name="username">
				<label class="login-field-icon fui-user" for="login-name"></label>
				</div>

				<div class="control-group">
				<input type="password" class="login-field" value="" placeholder="password" id="login-pass" name="password">
				<label class="login-field-icon fui-lock" for="login-pass"></label>
				</div>

				<input class="btn btn-primary btn-large btn-block" type="submit" value="login"/>
			</div>

			<% if(request.getParameter("username") != adPlatform.getAffiliatesDatabase().get(1);) %>
		</div>
	</div>
</body>

</html>