

import java.io.IOException;
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

/**
 * Servlet implementation class GeneralHealthDetails
 */
@WebServlet("/GeneralHealthDetails")
public class GeneralHealthDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneralHealthDetails() {
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
		String disease=request.getParameter("dis");
		String problem = "";
		String tips="";
		ArrayList a;
		Health h = new Health();
		
		/*try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con  =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","manasa","manasa@venu");
			Statement stmt=DBConnection.getconnection().createStatement();
			
			ResultSet rs=stmt.executeQuery("SELECT PROBLEM,TIPS FROM GENERALHEALTHTIPS WHERE PROBLEM='"+disease+"'");
			System.out.println("SELECT PROBLEM,TIPS FROM GENERALHEALTHTIPS WHERE PROBLEM='"+disease+"'");
			while(rs.next())
			{
				problem=rs.getString(1);
				tips=rs.getString(2);
				System.out.println("problem");
				System.out.println("tips");
			}
			HttpSession GHT = request.getSession();
			//request.getSession().setAttribute("problems", problem);
			GHT.setAttribute("problems", problem);
			GHT.setAttribute("tips", tips);
			response.sendRedirect("/E-Health_Care/GeneralTips.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		a=h.gethealthDetails(disease);
		HttpSession GHT = request.getSession();
		//request.getSession().setAttribute("problems", problem);
		GHT.setAttribute("problems", a.get(0));
		GHT.setAttribute("tips", a.get(1));
		response.sendRedirect("/E-Health_Care/GeneralTips.jsp");
		
	}

}
