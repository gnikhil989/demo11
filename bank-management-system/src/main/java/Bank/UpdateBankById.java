package Bank;

import com.jsp.dto.Bank;
import com.jsp.service.BankService;

public class UpdateBankById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bankService=new BankService();
		Bank bank= new Bank();
		bank.setBank_name("BOB");
		Bank b=bankService.updateBank(5, bank);
		if(b!=null) {
			System.err.println("=======================================");
			System.out.println("Updated Bank "+b.getBank_name());
			System.err.println("=======================================");
			
		}else {
			System.err.println("=======================================");
			System.out.println("Bank Not Found");
			System.err.println("=======================================");
		}

	}

}
