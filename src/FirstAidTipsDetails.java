

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.net.aso.e;

/**
 * Servlet implementation class FirstAidTipsDetails
 */
@WebServlet("/FirstAidTipsDetails")
public class FirstAidTipsDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstAidTipsDetails() {
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
		
		System.out.println("DOne");
		String fit=request.getParameter("firstaidtips");
		String firstaidproblem="";
		String firstaidtips="";
		Firstaid f=new Firstaid();
		ArrayList<e> a;
	/*	 try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manasa","manasa@venu");
			Statement stmt=DBConnection.getconnection().createStatement();
			ResultSet rs=stmt.executeQuery("SELECT FIRSTAIDPROBLEM,FIRSTAIDTIPS FROM FIRSTAIDTIPSDETAILS WHERE FIRSTAIDPROBLEM='"+fit+"'");
			//System.out.println("SELECT FIRSTAIDPROBLEM,FIRSTAIDTIPS FROM FIRSTAIDTIPSDETAILS WHERE FIRSTAIDPROBLEM='"+fit+"'");
			while(rs.next())
			{
				firstaidproblem=rs.getString(1);
				firstaidtips=rs.getString(2);
				System.out.println("firstaidproblem");
				System.out.println("firstaidtips");
			} 
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		a=f.getfirstaidDetails(fit);
		HttpSession fat=request.getSession();
		fat.setAttribute("fap", a.get(0));
		fat.setAttribute("fat", a.get(1));
		response.sendRedirect("/E-Health_Care/FirstAid.jsp");	
	}

}
