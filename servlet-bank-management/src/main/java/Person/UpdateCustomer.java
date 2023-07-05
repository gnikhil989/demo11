package Person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Bank;
import com.jsp.dto.Person;
import com.jsp.service.BankService;
import com.jsp.service.PersonService;

@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet{
PersonService personService= new PersonService();
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String email= req.getParameter("email");
	String id=req.getParameter("id");
	int id1=Integer.parseInt(id);
	Person person=personService.getPersonById(id1);
	
	person.setName(name);
	person.setEmail(email);
	Person person2= personService.updatePersonById(id1, person);
	if(person2!=null) {
		System.err.println("=======================================");
		System.out.println("Customer Details Are updated "+person2.getName());
		System.err.println("=======================================");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("CustomerController.jsp");
		requestDispatcher.forward(req, resp);
			}else {
				System.err.println("=======================================");
				System.out.println("Customer Not Found");
				System.err.println("=======================================");
				PrintWriter printWriter= resp.getWriter();
				printWriter.write("<html><body><h1>"+"Wrong Input "+"</h1></body></html>");
			}
	}
}
