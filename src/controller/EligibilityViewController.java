package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CDS;

@WebServlet(urlPatterns= {"/eligible"})
public class EligibilityViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EligibilityViewController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String submit=request.getParameter("submit");
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String country=request.getParameter("country");
		int height=Integer.parseInt(request.getParameter("height"));
		int weight=Integer.parseInt(request.getParameter("weight"));
		String number=request.getParameter("Number");
		
		
		
		if (submit != null) {
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/form.jsp");
			rd.forward(request, response);
		}
			CDS cds=new CDS(name,age,country,height,weight,number);
			boolean a=cds.baseEligibility();
			boolean b=cds.cdsEligible();
			if(a==true&&b==true)
			{
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/quiz.jsp");
				rd.forward(request, response);	
			}
			else
			{
				RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
				rd.forward(request, response);
				
			}
		
}
}

