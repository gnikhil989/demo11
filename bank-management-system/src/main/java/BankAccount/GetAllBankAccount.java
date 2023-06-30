package BankAccount;

import java.util.List;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class GetAllBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService bankAccountService=new BankAccountService();
		List<BankAccount> bankAccounts=bankAccountService.getAllAccountDetails();
		if (!bankAccounts.isEmpty()) {
			for (BankAccount ba : bankAccounts) {
				System.out.println(
						ba.getAccount_id() + " " + ba.getAccount_number() + " " + ba.getBalance() + " " + ba.getType());
			}
		} else {
			System.out.println("Accounts Not Found");
		}

	}

}
