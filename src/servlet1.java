
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;



public class servlet1 extends HttpServlet {

       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if((uname.equals("uname")&&pwd.equals("pwd"))||(uname.equals("uname2")&&pwd.equals("pwd2"))) {
			Cookie c=new Cookie("user-name", uname);
			response.addCookie(c);
			c.setMaxAge(60*60*24);
			RequestDispatcher rd = request.getRequestDispatcher("Home.html");
			rd.forward(request, response);
		}
		else {
			out.println("Wrong Credentials");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
