package one;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class main
 */
@WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("one");
		
		if(request.getParameter("Sign In")!=null) {
			//if(request.getParameter("email1")!=null && request.getParameter("email1").compareTo("rohan14156")==0) {
			System.out.println("two");
			System.out.println(request.getParameter("website"));
			if(request.getParameter("email")!=null && request.getParameter("email").compareTo("a@gmail.com")==0 && request.getParameter("website")!=null && request.getParameter("website").compareTo("alind")==0)
			{	
				//RequestDispatcher rd1=request.getRequestDispatcher("/evs/Home_n_Map/test_map.html");
				//rd1.forward(request, response);
				response.sendRedirect("evs/Home_n_Map/test_map.html");
			}
				//if(request.getParameter("password1")!=null && request.getParameter("password1").compareTo("rohan")))
			//}
		}
		
	}

}
