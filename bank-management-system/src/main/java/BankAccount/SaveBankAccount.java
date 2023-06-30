package BankAccount;

import java.util.ArrayList;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;
import com.jsp.service.BankService;

public class SaveBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService bankAccountService=new BankAccountService();
		BankService bankService=new BankService();
		BankAccount account1= new BankAccount();
		 account1.setBank(bankService.getBankByid(1));
		 account1.setAccount_number(1930);
		 account1.setBalance(999.0);
		 account1.setType("saving");
		 
		 ArrayList<BankAccount> bankAccounts=new ArrayList<>();
		 bankAccounts.add(account1);
		 
		 BankAccount bankAccount=bankAccountService.saveBankAccountById(1, account1);
		 
		 if(bankAccount!=null) {
			 System.out.println(bankAccount.getAccount_id()+" "+bankAccount.getAccount_number()+" "+bankAccount.getBalance());
			 
		 }

	}

}
