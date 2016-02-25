import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.ServletConfig;
public class P13 extends HttpServlet {
	public void init(ServletConfig c){
	}
	public void doGet(HttpServletRequest rq,HttpServletResponse re) throws ServletException{
		try{
			re.setContentType("text/html");
			PrintWriter out=re.getWriter();
			String name=rq.getParameter("name");
			String pass=rq.getParameter("pass");
			if(pass.equals("Admin")){
				re.sendRedirect("Welcome");
			}
			else{
				re.sendRedirect("P13.html");
			}
		}
		catch(IOException i){
			System.out.println("IOException");
		}
	}
	public void destroy(){
	}

}