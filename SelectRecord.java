import java.io.*;
 import javax.servlet.*;
 import javax.servlet.http.*;
 import java.sql.*;
  
 public class SelectRecord extends HttpServlet {
  
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
         PrintWriter out = res.getWriter();
         res.setContentType("text/html");
         out.println("<html><body>");
         try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "onishi1313");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from bit");
             out.println("<table border=2>");
             out.println("<tr><th>ID</th><th>Name</th><th>Department</th><tr>");
             while (rs.next()) {
                 int n = rs.getInt("ID");
                 String nm = rs.getString("Name");
                 String s = rs.getString("Dept"); 
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>"); 
             }
             out.println("</table>");
             out.println("</html></body>");
             con.close();
            }
             catch (Exception e) {
             out.println("error");
         }
     }
 }