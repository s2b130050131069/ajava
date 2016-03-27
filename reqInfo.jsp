<%@ page language="java" %>


<head>
    <title>READING REQUEST INFORMATION</title>
</head>
<body>
    130050131044
    <br>
    <br>
    <table border="2">
        <tr>
            <td>METHOD </td>
            <td><%=request.getMethod()%> </td>
        </tr>
        <tr>
            <td>GET_URI_REQUEST</td><td> <%=request.getRequestURI()%></td>
        </tr>
        <tr>
            <td>GET_PROTOCOL</td><td> <%=request.getProtocol()%></td>
        </tr>
        <tr>
            <td>GET_PATH_INFO</td><td> <%=request.getPathInfo()%></td>
        </tr>
        <tr>
            <td>GET_PATH_TRANSLATED</td><td> <%=request.getPathTranslated()%></td>
        </tr>
        <tr>
            <td>GET_QUERY_STRING</td><td><%=request.getQueryString()%></td>
        </tr>
        <tr>
            <td>Get_CONTENT_LENGTH</td><td><%=request.getContentLength()%></td>
        </tr>
        <tr>
            <td>GET_SERVER_NAME</td><td><%=request.getServerName()%></td>
        </tr>
        <tr>
            <td>GET_SERVER_PORT</td><td><%=request.getServerPort()%></td>
        </tr>
        <tr>
            <td>GET_REMOTE_USER</td><td><%=request.getRemoteUser()%></td>
        </tr>
        <tr>
            <td>GET_REMOTE_ADDRESS</td><td><%=request.getRemoteAddr()%></td>
        </tr>
        <tr>
            <td>GET_REMOTE_HOST</td><td><%=request.getRemoteHost()%></td>
        </tr>
        <tr>
            <td>CONTENT_TYPE</td><td><%=request.getContentType()%></td>
        </tr>
        <tr>
            <td>GET_AUTHOR_TYPE</td><td><%=request.getAuthType()%></td>
        </tr>
    </table>



</body>
</html>