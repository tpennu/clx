<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if((username.equals("Sindhura") && password.equals("hidi")))
            {
            session.setAttribute("username",username);
            response.sendRedirect("login_success.jsp");
            }
        else
            response.sendRedirect("login_error.jsp");
        %>
    </body>
</html>
