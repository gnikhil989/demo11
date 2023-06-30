package BankAccount;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class TransferMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService bankAccountService= new BankAccountService();
		BankAccount bankAccount=bankAccountService.transferMoney(1, 2, 3434);
				if(bankAccount!=null)
				{
					System.out.println("Transfer Successfull Your remaining Balance Is "+bankAccount.getBalance());
				}else
				{
					System.out.println("Account Not Found or Less Account balance");
				}
	}

}
