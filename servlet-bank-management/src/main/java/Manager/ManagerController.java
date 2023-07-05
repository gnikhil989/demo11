package Manager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManagerController")
public class ManagerController extends HttpServlet{
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String Save=req.getParameter("Save");
	String Update= req.getParameter("Update");
	String GetAll= req.getParameter("GetAllCustomer");
	if(Save!=null) {
		System.out.println(Save);
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("SaveManager.jsp");
		requestDispatcher.forward(req, resp);
		
	}else if(Update!=null) {
		System.out.println(Update);
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("UpdateManager.jsp");
		requestDispatcher.forward(req, resp);
	}else if(GetAll!=null) {
		System.out.println(Update);
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("GetAllCustomer.jsp");
		requestDispatcher.forward(req, resp);
	}
}
}