package Manager;

import java.util.ArrayList;

import com.jsp.dto.Bank;
import com.jsp.dto.Manager;
import com.jsp.service.ManagerService;

public class SaveManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService = new ManagerService();
		Bank bank = new Bank();
		Manager manager2 = new Manager();
		manager2.setManager_name("saxena");
		manager2.setEmail("saxena@123");

		Manager manager1 = new Manager();
		manager1.setManager_name("shinde");
		manager1.setEmail("shinde@12");
		manager1.setBank(bank);
		Manager manager11 = managerService.saveManager(manager1);
//		Manager manager22 = managerService.saveManager(manager2);
		ArrayList<Manager> managers=new ArrayList<>();
		managers.add(manager11);
		if (manager11 != null) {
			System.out.println(manager11.getManager_name() + " " + manager11.getEmail());
		} else {
			System.out.println("Manager not saved try again");

		}
//		if (manager22 != null) {
//			System.out.println(manager22.getManager_name() + " " + manager22.getEmail());
//		} else {
//			System.out.println("Manager  not saved try again");
//		}
	}
}
