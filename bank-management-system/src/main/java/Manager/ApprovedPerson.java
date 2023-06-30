package Manager;

import com.jsp.dto.Manager;
import com.jsp.dto.Person;
import com.jsp.service.ManagerService;
import com.jsp.service.PersonSerivce;

public class ApprovedPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService= new ManagerService();
		PersonSerivce personSerivce=new PersonSerivce();
		Person person = personSerivce.getPersonById(1);
		Manager approvalManager=managerService.approvePersonById(1, 1);
		
		if(approvalManager!=null) {
			System.out.println(person.getName()+" is approved by "+approvalManager.getManager_name());
		}else {
			System.out.println("Invalid person or manager is not found");
		}

	}

}
