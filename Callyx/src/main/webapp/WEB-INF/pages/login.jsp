<%@ taglib prefix="s"   uri=http://www.springframework.org/tags  %>
<div>
<h2>Sign into Caalyx</h2>

<p>
If you've been using Caalyx from your phone,
then that's amazing...we don't support IM yet.
</p>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <center>
            <h2>Signup Details</h2>
            <form action="LoginCheck.jsp" method="post">
            <br/>Username:<input type="text" name="username">
            <br/>Password:<input type="password" name="password">
            <br/><input type="submit" value="Submit">
            </form>
        </center>
    </body>
</html>













