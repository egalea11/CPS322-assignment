<%-- JSP comment --%>
<!-- HTML comment -->

<%@ page import="cps3222.classes.*" %>


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
          200

          <input class="btn btn-primary btn-large btn-block" type="submit" value="withdraw">
        </div>
      </div>
    </div>
  </div>
</body>



</html>
