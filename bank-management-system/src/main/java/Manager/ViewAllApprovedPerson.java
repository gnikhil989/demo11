package Manager;

import java.util.List;

import com.jsp.dto.Manager;
import com.jsp.dto.Person;
import com.jsp.service.ManagerService;

public class ViewAllApprovedPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		ManagerService managerService = new ManagerService();
		List<Person> approvedPersons = managerService.viewAllApprovedPerson();
		if(!approvedPersons.isEmpty()) {
			for (Person personlist : approvedPersons) {
				System.out.println(personlist.getPerson_id()+" "+personlist.getName()+" "+personlist.getEmail()+" "+personlist.getStatus());
			}
		}else {
			System.out.println("no such person found");
			
		}
	}

}
