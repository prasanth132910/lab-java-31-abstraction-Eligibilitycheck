package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/eligiblemain"})
public class eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	int points=Integer.parseInt(request.getParameter("points"));
	System.out.print("points"+points);
	if(points>20)
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/Successful.html");
		rd.forward(request, response);	
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}