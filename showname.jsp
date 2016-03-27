<%@ page language="java" %>

<html>
<head>

<title>Insert title here</title>
</head>
<body >
    <center>
    <h1>Welcome</h1>
    <h1><%String name=request.getParameter("username"); %></h1>
<h1><%

out.println(""+name);
%></h1>

    </center>
</body>
</html>