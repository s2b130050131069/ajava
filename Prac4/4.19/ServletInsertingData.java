import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ServletInsertingData extends HttpServlet{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.postgresql.Driver";
	static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/s2b130050131069";

	//  Database credentials
	static final String USER = "postgres";
	static final String PASS = "kishan1150";
	   
	public void init() throws ServletException{
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(false);
		if(session == null){
			session = request.getSession();
		}
		
		PrintWriter out = response.getWriter();
		Connection conn = null;
	    Statement stmt = null;
		try{
			System.out.println("Enrollno: 130050131069");
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
			
			stmt = conn.createStatement();
		    
			//STEP 2: Executing query		
			String name = "ASDF";
			String rollno = "20";
			String branch = "CSE";
		    String sql = "INSERT INTO student(rollno, name, branch) VALUES ('"+rollno+"', '"+ name+"', '"+ branch+"')";
	
		    if(stmt.executeUpdate(sql) != 0){
		    	out.println("Record has been inserted</br>");
		    }else{
		    	out.println("Sorry! Failure</br>");
		    }
		}catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void destroy(){
		
	}
  
}