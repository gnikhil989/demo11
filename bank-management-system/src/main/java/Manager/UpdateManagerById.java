package Manager;

import com.jsp.dto.Manager;
import com.jsp.service.ManagerService;

public class UpdateManagerById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService = new ManagerService();
		Manager manager=new Manager();
		manager.setManager_name("kale");
		manager.setEmail("kale@123");
		
		Manager newmanager= managerService.updateManager(1, manager);
		if(newmanager!=null) {
			System.out.println("==============================");
			System.out.println(newmanager.getManager_name()+" "+newmanager.getEmail()+" Updated ");
			System.out.println("==============================");
		}else {
			System.out.println("==============================");
			System.out.println("Not Updated because of invalid input");
			System.out.println("==============================");
		}

	}

}
