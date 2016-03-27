
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LeftJoin extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "onishi1313");
            ps = con.prepareStatement("SELECT * FROM bit NATURAL JOIN account");
            rs = ps.executeQuery();
            pw.println("130050131044");
            pw.println("<table border=1><tr>");
            pw.println("<th>stu_rollno</th>");
            pw.println("<th>stu_Name</th>");
            pw.println("<th>stu_branch</th>");
            pw.println("<th>acc_no</th>");
            pw.println("<th>balance</th>");
            pw.println("</tr>");

            while (rs.next()) {
                Integer stu_rollno = rs.getInt("ID");
                String stu_Name = rs.getString("Name");
                String stu_branch = rs.getString("Dept");
                Integer acc_no = rs.getInt("ac_no");
                Integer balance = rs.getInt("balance");
                pw.println("<tr>");
                pw.println("<td>" + stu_rollno + "</td>");
                pw.println("<td>" + stu_Name + "</td>");
                pw.println("<td>" + stu_branch + "</td>");
                pw.println("<td>" + acc_no + "</td>");
                pw.println("<td >" + balance + "</td>");
                pw.println("</tr>");
            }
                pw.println("</table>");
            
            try {
                con.close();
                ps.close();
            } catch (Exception e) {
                pw.println(e);
            }
        } catch (SQLException sx) {
            pw.println(sx);
        } catch (ClassNotFoundException cx) {
            pw.println(cx);
        }
    }
}
