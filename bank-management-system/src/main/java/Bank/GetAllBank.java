package Bank;

import java.util.List;

import com.jsp.dto.Bank;
import com.jsp.service.BankService;

public class GetAllBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankService bankService = new BankService();
		List<Bank> banks = bankService.getAllBanks();
		if (!banks.isEmpty()) {
			for (Bank bank : banks) {
				System.out.println(bank.getId() + " " + bank.getBank_name() + " " + bank.getCity());

			}
		}else {
			System.out.println("banks not found");
		}

	}

}
