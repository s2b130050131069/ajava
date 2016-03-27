import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InsertRecord extends HttpServlet{
  public void doGet(HttpServletRequest request, 
  HttpServletResponse response)throws 
  ServletException, IOException{  
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String url ="jdbc:mysql://localhost:3306/mydb";
  Connection conn;
  try{
  Class.forName("com.mysql.jdbc.Driver");
  conn = DriverManager.getConnection(url,"root","onishi1313");
  Statement statement = conn.createStatement();
  String query = "insert into bit values(110,'Yash Mehta','CSE')";
  int i = statement.executeUpdate(query);
  if(i!=0){
  out.println("The record has been inserted");
  }
  else{
  out.println("Sorry! Fail to Insert");
  }
  statement.close();
  }
  catch (Exception e){
  System.out.println(e);
  }
  }
}