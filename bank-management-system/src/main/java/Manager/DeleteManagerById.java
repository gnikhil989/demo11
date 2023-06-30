package Manager;

import com.jsp.service.ManagerService;

public class DeleteManagerById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService=new ManagerService();
		boolean b=managerService.deleteManagerById(1);
		if(b==true) {
			System.out.println("======================");
			System.out.println("Manager is deleted");
			System.out.println("========================");
		}else {
			System.out.println("===================");
			System.out.println("Manager not found ,please enter valid manager id");
			System.out.println("=======================");
		}

	}

}
