package BankAccount;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class WithDrawMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService bankAccountService=new BankAccountService();
		BankAccount bankAccount= bankAccountService.widthrawMoney(1, 1, 10);
		if(bankAccount!=null)
		{
			System.out.println("Withdrawl Successfull remaning balance is "+bankAccount.getBalance());
		}else
		{
			System.out.println("Account Not Found or Less balance");
		}
		

	}

}
