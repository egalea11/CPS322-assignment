<html>
<head>
<title>Using GET Method to Read Form Data</title>
</head>
<body>
<center>
<h1>Using GET Method to Read Form Data</h1>
<ul>
<li><p><b>Username:</b>
   <%= request.getParameter("username")%>
</p></li>
<li><p><b>Password:</b>
   <%= request.getParameter("password")%>
</p></li>
</ul>
</body>
</html>
