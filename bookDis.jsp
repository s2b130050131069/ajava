<%@ page language="java" import="java.sql.*" %>



<html>
<head>

<title>book</title>
</head>
<body>
<%	
    Connection conn;
	
	PreparedStatement pstmt;
	ResultSet resultset;
	
	 final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	 final String USER = "root";
	 final String PASS = "onishi1313";
	 Class.forName(JDBC_DRIVER);
	 conn = DriverManager.getConnection(DB_URL, USER, PASS);
	 Statement stmt= conn.createStatement();
	 out.println("Connected database successfully...");
     %>
     <br>
     <%
		String id1=request.getParameter("id");
		String name=request.getParameter("book_name");
		String auth=request.getParameter("author");
		int id=Integer.parseInt(id1);	
		String sql="INSERT INTO book_details(id, book_name, author) VALUES(?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, auth);
		pstmt.addBatch();
		if(pstmt.executeBatch().length != 0){
        	out.println("Record has been inserted");
        }else {
        	out.println("sorry! Failure");
        }
		%>
		<br>
		<%
		out.print("Enroll no: 130050131044");
		resultset = stmt.executeQuery("select * from book_details");
		%>
		<br>
	        <TABLE BORDER="1">
	            <TR>
	                <TH>ID</TH>
	                <TH>Name</TH>
	                <TH>Author</TH>
	                
	            </TR>
	            <% while(resultset.next()){ %>
	            <TR>
	                <TD> <%= resultset.getInt(1) %></td>
	                <TD> <%= resultset.getString(2) %></TD>
	                <TD> <%= resultset.getString(3) %></TD>
	            </TR>
	            <% } %>
	        </TABLE>

</body>
</html>