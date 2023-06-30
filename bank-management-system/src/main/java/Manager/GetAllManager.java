package Manager;

import java.util.List;

import com.jsp.dto.Manager;
import com.jsp.service.ManagerService;

public class GetAllManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService= new ManagerService();
		List<Manager> managers=managerService.getAllManagers();
		if(!managers.isEmpty()) {
			for (Manager managerlist : managers) {
				System.out.println(managerlist.getManager_id()+" "+managerlist.getManager_name());
			}
		}
		else {
			System.out.println("manager not found");
		}
	}

}
