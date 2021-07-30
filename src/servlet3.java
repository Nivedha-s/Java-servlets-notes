

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

//@WebServlet("/servlet3")
public class servlet3 extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("Logout.html");
		rd.include(request, response);
		Cookie ck[] = request.getCookies();
		out.println("Logged out "+ck[0].getValue()+ " !");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
