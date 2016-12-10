<% import   %>

<html>
<head>
  <meta charset="UTF-8">
  <title id="title">Admin Account</title>
  <link rel="stylesheet" href="css/style.css">
</head>

  <body>
	<div class="login">
		<div class="login-screen">
		    <div class="app-title">
                <h1>Accounts Page</h1>
            </div>

			<div class="area">
				<div class="control-group">
				<label>
				    <b>
                        <%= request.getParameter("username")%>
                   </b>
                </label>
                <label>
                    <%= request.getParameter("username")%>
                </label>
				<label class="login-field-icon fui-user" for="login-name"></label>



				</div>

				<input class="btn btn-primary btn-large btn-block" type="submit" value="balance"/>
			</div>
		</div>
	</div>
</body>

</html>