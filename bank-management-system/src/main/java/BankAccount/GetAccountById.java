package BankAccount;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class GetAccountById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService bankAccountService = new BankAccountService();
		BankAccount bankAccount = bankAccountService.getAccountDetailsById(1);
		if (bankAccount != null) {
			System.out.println(bankAccount.getAccount_id() + " " + bankAccount.getAccount_number() + " "
					+ bankAccount.getBalance() + " " + bankAccount.getType());
		} else {
			System.out.println("Account Are Not Found");
		}
	}

}
