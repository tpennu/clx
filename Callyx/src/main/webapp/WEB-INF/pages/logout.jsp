<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
 
        session.removeAttribute("username");
        session.removeAttribute("password");
        session.invalidate();
        %>
        <h1>You have successfully signed out of Caalyx.</h1>
         
    </body>
</html>


