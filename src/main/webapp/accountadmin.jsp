<html>

<head>
  <meta charset="UTF-8">
  <title id="title">Admin Account</title>
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div class="column-split">
      <div class="login">
        <div class="login-screen">
          <div class="app-title">
            <h1>Account</h1>
          </div>

          <%--withdraw balance--%>
          <div class="area">
            <form action="account" method="GET" name="withdrawpls">
              <div class="control-group">
                <label>
                  <b>
                      <span><%=request.getSession().getAttribute("username")%></span>
                  </b>
                  <span> - <%=request.getSession().getAttribute("affiliatetype")%></span>
                </label>
                <br/><br/>
                <div class="balance">
                  <p><b>Current Balance</b>
                    <%-- current balance --%>
                    <div name="balance">
                      <%=request.getSession().getAttribute("userbalance")%>
                    </div>
                    euros
                  </p>
                </div>
                  <%-- tracked total balance --%>
                <div class="tracked-balance">
                  <p><b>Tracked Balance</b>
                     <div name="balance">
                       <%=request.getSession().getAttribute("usertrackedbalance")%>
                     </div>
                  euros
                  </p>
                </div>

                <br/> <br/>
                <%-- withdraw button --%>
                  <input class="btn btn-primary btn-large btn-block" type="submit" value="withdraw" name="withdraw-btn">
                </div>
              </form>
              <p><b><%= session.getAttribute("transactionMsg") %></b></p>
          </div>
        </div>
      </div>
    </div>

    <%-- affiliate advert request --%>
    <div class="column-split">
        <div class="login">
            <div class="login-screen">
                <div class="app-title">
                    <h1>Advert Request</h1>
                </div>
                <div class="area">
                   <form action="advert" method="GET" name="advertpls">
                      <div class="control-group">

                          <input type="text" placeholder="enter keyword" name="keyword"/>
                          <br/><br/>

                          <%-- submit keyword button --%>
                          <input class="btn btn-primary btn-large btn-block" type="submit" value="Request Advert">
                      </div>
                      <p><%= session.getAttribute("adname") %></p>
                   </form>
                </div>
            </div>
          </div>
      </div>

    <% if(session.getAttribute("adname") != null){ %>


    <%-- advert space --%>
    <div class="column-split">
        <div class="login">
            <div class="login-screen">
                <div class="app-title">
                    <h1>Advert</h1>
                </div>
                <div class="area">
                    <form action="adclick" method="GET" name="clickpls">
                        <div class="control-group">
                            <%-- clickable advert --%>
                            <input class="btn btn-primary btn-large btn-block ad" type="submit" value="<%= session.getAttribute("adname")%>">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <%}%>

</body>

</html>
