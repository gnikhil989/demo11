package BankAccount;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class DepositMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService bankAccountService= new BankAccountService();
		BankAccount bankAccount=bankAccountService.depositMoney(1, 1, 123453);
				  
			    if(bankAccount!=null)
			    {
			    	System.out.println(bankAccount.getBalance());
			    }else
			    {
			    	System.out.println("Account Not Found");
			    }
			}

}
