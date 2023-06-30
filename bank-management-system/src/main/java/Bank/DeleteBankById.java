package Bank;

import com.jsp.service.BankService;

public class DeleteBankById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bankService = new BankService();
		boolean b = bankService.deleteBankById(2);
		if (b == true) {
			System.out.println("===================================");
			System.out.println("Bank got deleted");
			System.out.println("===================================");
		} else {
			System.out.println("===================================");
			System.out.println("Bank Not Found");
			System.out.println("===================================");
		}

	}

}
