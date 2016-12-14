<%-- JSP comment --%>
<!-- HTML comment -->


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

        <form action="account" method="GET" name="withdrawpls">
          <div class="control-group">
            <label>
              <b>
                <p><%=request.getSession().getAttribute("username")%></p>
              </b>
            </label>
            <div class="balance">
              <p>
                <div name="balance">
                  <%=request.getSession().getAttribute("userbalance")%>
                </div>
                euros
              </p>
            </div>
            <%-- withdraw button --%>
              <input class="btn btn-primary btn-large btn-block" type="submit" value="withdraw">
            </div>
          </form>
        <p><%= session.getAttribute("transactionMsg") %></p>
      </div>
    </div>
  </div>
</body>



</html>
