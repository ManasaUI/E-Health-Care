

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationDetails
 */
@WebServlet("/RegistrationDetails")
public class RegistrationDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	doPost(request, response);
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Registration r = new Registration();
		String fname = request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String dob=request.getParameter("dateofbirth");
		String eaddress=request.getParameter("emailaddress");
		String pnumber=request.getParameter("phonenumber");
		String add=request.getParameter("address");
		String pword=request.getParameter("pw");
		
		
		System.out.println("The Password is" +pword);
		/*try {*/
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con  =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manasa","manasa@venu");
			
			//Statement stmt=DBConnection.getconnection().createStatement();
			//stmt.executeUpdate("INSERT INTO REGISTRATIONDETAILS VALUES('"+fname.trim()+"','"+lname.trim()+"','"+dob.trim()+"','"+eaddress.trim()+"','"+pnumber.trim()+"','"+add.trim()+"','"+pword.trim()+"') ");
			r.setNewRegistration(fname,lname,dob,eaddress,pnumber,add,pword);
			response.sendRedirect("/E-Health_Care/Login%20Form.html");
		
/*		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		
			}

	private String trime() {
		// TODO Auto-generated method stub
		return null;
	}

}
