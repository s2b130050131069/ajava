import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletConfig;
public class InsertData_html extends HttpServlet {
	public void init(ServletConfig c){
	}
	public void doGet(HttpServletRequest rq,HttpServletResponse re) throws ServletException{
		re.setContentType("text/html");
		Connection c=null;
		Statement s=null;
		try{
			PrintWriter out=re.getWriter();
			
			int id=Integer.parseInt(rq.getParameter("id"));
                        String name=rq.getParameter("name");
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","onishi1313");
			s=c.createStatement();
			out.println("<h2>eno=130050131044</h2>");
			String query="insert into emp_info values("+id+",'"+name+"')";
			int i=s.executeUpdate(query);
			if(i!=0){
				out.println("<h2>Record has been inserted</h2>");
			}
			else{
				out.println("<h2>sorry! Failure</h2>");
			}
		}
		catch(IOException i){
			System.out.println("IOException");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void destroy(){
	}
}