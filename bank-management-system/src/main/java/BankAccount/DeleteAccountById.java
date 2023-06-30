package BankAccount;

import com.jsp.service.BankAccountService;
import com.jsp.service.BankService;

public class DeleteAccountById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService bankAccountService= new BankAccountService();

		boolean b=bankAccountService.deleteBankAccountById(1);
		
		if(b==true)
		{
			System.out.println("Account deleted");
		}else
		{
			System.out.println("Account Not Found");
		}
	}

	}


