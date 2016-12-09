

import java.io.IOException;
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
 * Servlet implementation class UpdateDetails
 */
@WebServlet("/UpdateDetails")
public class UpdateDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Updating details");
		Update u=new Update();
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String dob=request.getParameter("dateofbirth");
		String pnumber=request.getParameter("phonenumber");
		String add=request.getParameter("address");
		String eaddress=request.getParameter("emailaddress");
		String pword=request.getParameter("pw");
		
		
	/*	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manasa","manasa@venu");
			Statement stmt=DBConnection.getconnection().createStatement();
			String query = "UPDATE REGISTRATIONDETAILS SET firstname='"+fname.trim()+"', lastname='"+lname.trim()+"',dateofbirth='"+dob.trim()+"',phonenumber='"+pnumber.trim()+"', address='"+add.trim()+"',password='"+pword.trim()+"'where emailaddress='"+eaddress.trim()+"'";
			System.out.println(query);
			int i = stmt.executeUpdate(query);
			System.out.println("The I value is " +i); 
			
					} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		u.updateDetails(fname,lname,dob,eaddress,pnumber,add,pword);
		response.sendRedirect("/E-Health_Care/UpdatedSuccessfully.jsp");
	
}

}
