package Bank;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Bank;
import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;
import com.jsp.service.BankService;
import com.jsp.service.ManagerService;
@WebServlet("/SaveBank")
public class SaveBank extends HttpServlet {
//	BankAccount bankAccount= new BankAccount();
//	BankAccountService bankAccountService=new BankAccountService();
	BankService bankService= new BankService();
	ManagerService managerService= new ManagerService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Bank bank= new Bank();
	String name= req.getParameter("BankName");
	String city=req.getParameter("City");
	bank.setBank_name(name);
	bank.setCity(city);
	bank.setManagers(managerService.getAllManagers());
	Bank bank1= bankService.saveBankDetails(bank);
	if(bank1!=null) {
		System.out.println("================================================");
		System.out.println(bank.getBank_name() + " " + bank.getCity() + " " + bank.getId());
		System.out.println("============================");
		PrintWriter printWriter= resp.getWriter();
		printWriter.write("<html><body><h1>"+"You have Selected : "+ bank1.getBank_name()+"</h1></body></html>");
		printWriter.write("<html><body><h1>"+"Your Branch is : "+ bank1.getCity()+"</h1></body></html>");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("BankController.jsp");
		requestDispatcher.forward(req, resp);
	}else {
		PrintWriter printWriter= resp.getWriter();
		System.out.println("============================");
		System.out.println("Bank not saved");
		System.out.println("============================");
		printWriter.write("<html><body><h1>"+"Wrong Input "+"</h1></body></html>");
	}
	}
	

}
