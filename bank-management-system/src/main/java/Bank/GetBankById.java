package Bank;

import com.jsp.dto.Bank;
import com.jsp.service.BankService;

public class GetBankById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bankService= new BankService();
		Bank bank= bankService.getBankByid(1);
		if(bank!=null) {
			System.err.println("=======================================");
			System.out.println(bank.getId()+" "+bank.getBank_name()+" "+bank.getCity());
			System.err.println("=======================================");
		}else {
			System.err.println("=======================================");
			System.out.println("Invalid id");
			System.err.println("=======================================");
		}

	}

}
