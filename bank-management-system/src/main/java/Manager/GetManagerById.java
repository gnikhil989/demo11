package Manager;

import com.jsp.dto.Manager;
import com.jsp.service.ManagerService;

public class GetManagerById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService= new ManagerService();
		Manager managerbyid= managerService.getManagerById(12);
		if(managerbyid!=null) {
			System.out.println("===========================");
			System.out.println(managerbyid.getManager_id()+" "+managerbyid.getManager_name());
			System.out.println("===========================");
		}else {
			System.out.println("===========================");
			System.out.println("Manager Not Found");
			System.out.println("===========================");
		}

	}

}
