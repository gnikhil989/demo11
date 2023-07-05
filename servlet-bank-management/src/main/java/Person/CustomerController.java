package Person;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String Save = req.getParameter("Save");
		String SaveAccount = req.getParameter("SaveAccount");
		String Deposit = req.getParameter("Deposit");
		String Withdraw = req.getParameter("Withdraw");
		String Transfer = req.getParameter("Transer");
		String GetAccount = req.getParameter("GetAccount");

		String Update = req.getParameter("Update");
		if (Save != null) {
			System.out.println(Save);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("SaveCustomer.jsp");
			requestDispatcher.forward(req, resp);
		} else if (Update != null) {
			System.out.println(Update);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("UpdateCustomer.jsp");
			requestDispatcher.forward(req, resp);
		} else if (SaveAccount != null) {
			System.out.println(SaveAccount);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("SaveAccount.jsp");
			requestDispatcher.forward(req, resp);
		}else if (Deposit != null) {
			System.out.println(Deposit);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Deposit.jsp");
			requestDispatcher.forward(req, resp);
		}else if (Withdraw != null) {
			System.out.println(Withdraw);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Withdraw.jsp");
			requestDispatcher.forward(req, resp);
		}else if (Transfer != null) {
			System.out.println(Transfer);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Transfer.jsp");
			requestDispatcher.forward(req, resp);
		}else if (GetAccount != null) {
			System.out.println(GetAccount);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("GetAccountTable.jsp");
			requestDispatcher.forward(req, resp);
		}

	}
}
