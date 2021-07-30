

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;



public class servlet2 extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String d=request.getParameter("date");
		String desc=request.getParameter("desc");
		String title=request.getParameter("title");
		String priority=request.getParameter("priority");
		

		RequestDispatcher rd= request.getRequestDispatcher("Notes.html");
		rd.include(request, response);
		
		Cookie ck[]=request.getCookies();
		out.println(ck[0].getName()+" : "+ck[0].getValue());
		
		out.println("\n"+"Added Successfully\n");
		out.println("Date : "+d+"\nTitle : "+title+"\n Priority : "+priority+"\nDescription : "+ desc);
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
