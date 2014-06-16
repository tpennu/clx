<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<html>
   <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Sign into Caalyx seller portal</title>
   </head>

	<h2>Sign into Caalyx seller portal</h2>

	<p>
	If you've been using Caalyx from your phone,
	then that's amazing...we don't support IM yet.
	</p>
	
    <body>
        <center>
        	<%= request.getAttribute("message")==null?"":request.getAttribute("message") %>
           <form action="Login.spring" method="post">
	           <br/>Username:<input type="text" name="username">
	           <br/>Password:<input type="password" name="password">
	           <br/><input type="submit" value="Submit">
           </form>
        </center>
    </body>
</html>













