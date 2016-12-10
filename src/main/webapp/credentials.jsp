<html>
<head>
<title>Using GET Method to Read Form Data</title>
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
