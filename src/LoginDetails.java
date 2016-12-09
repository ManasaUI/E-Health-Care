

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginDetails
 */
@WebServlet("/LoginDetails")
public class LoginDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Doget");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Okay I am trying to Login to the system");
		
		String eaddress=request.getParameter("emailaddress");
	String pword=request.getParameter("pw");
	//userBean user = new userBean(eaddress);
	HttpSession ss = request.getSession();
	ss.setAttribute("email", eaddress);
	ss.setAttribute("pass", pword);
	ArrayList info = new ArrayList();
	Login l = new Login();
	/*try {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	ArrayList info = new ArrayList();
	//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manasa","manasa@venu");
	Statement stmt=DBConnection.getconnection().createStatement();
	ResultSet rs=stmt.executeQuery("SELECT * FROM REGISTRATIONDETAILS WHERE emailaddress='"+eaddress+"'and password='"+pword+"'");
	if(rs.next())
	{
		info.add(rs.getString(1));
		info.add(rs.getString(2));
		info.add(rs.getString(3));
		info.add(rs.getString(4));
		info.add(rs.getString(5));
		info.add(rs.getString(6));
		info.add(rs.getString(7));
		//System.out.println(in);
		ss.setAttribute("information",info);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Home.html");
		dispatcher.forward(request, response);
	}
	else
	{
		response.sendRedirect("/E-Health_Care/WrongLogindetails.html");
	}
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
	info = l.getRegisterDetails(eaddress,pword);
	if(info.size()!=0)
	{
	
		ss.setAttribute("information",info);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.html");
		dispatcher.forward(request, response);
	
	}else
	{
		response.sendRedirect("/E-Health_Care/WrongLogindetails.html");
	}
	

}
}
