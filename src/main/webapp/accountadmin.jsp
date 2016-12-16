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

      <%--withdraw balance--%>
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
              <input class="btn btn-primary btn-large btn-block" type="submit" value="withdraw" name="withdraw-btn">
            </div>
          </form>
        <p><%= session.getAttribute("transactionMsg") %></p>
      </div>
    </div>

      <br/><br/>

      <div class="login-screen">
          <div class="app-title">
              <h1>Advert</h1>
          </div>

          <%-- advert--%>
          <div class="area">
              <form action="advert" method="GET" name="advertpls">
                  <div class="control-group">

                      <input type="text" placeholder="enter keyword" name="keyword"/>

                      <%-- submit keyword button --%>
                      <input class="btn btn-primary btn-large btn-block" type="submit" value="submitKeyword">
                  </div>
                  <p><%= session.getAttribute("keyword") %></p>
              </form>
          </div>

      </div>

  </div>
</body>



</html>
