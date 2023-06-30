package Bank;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Bank;
import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;
import com.jsp.service.BankService;
import com.jsp.service.ManagerService;

public class SaveBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bankService = new BankService();
		BankAccount bankAccount = new BankAccount();
		BankAccountService bankAccountService = new BankAccountService();
		ManagerService managerService = new ManagerService();
		Bank b1 = new Bank();
		b1.setBank_name("BOB");
		b1.setCity("MUMBAI");
		b1.setManagers(managerService.getAllManagers());
		Bank bank = bankService.saveBankDetails(b1);


//		bank.setBankAccount(
		if (bank != null) {
			System.out.println("============================");
			System.out.println(bank.getBank_name() + " " + bank.getCity() + " " + bank.getId());
			System.out.println("============================");
		} else {
			System.out.println("============================");
			System.out.println("Bank not saved");
			System.out.println("============================");

		}

	}

}
