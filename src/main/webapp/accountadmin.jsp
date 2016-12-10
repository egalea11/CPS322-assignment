<html>
<head>
<title id="title">Admin Account</title>
</head>
<body>
<center>
<h1>Accounts Page</h1>
<ul>
<p><b>Username:</b>
   <%= request.getParameter("username")%>
</p>
<p><b>Password:</b>
   <%= request.getParameter("password")%>
</p>
</ul>
</body>
</html>
