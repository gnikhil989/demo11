package Manager;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.ManagerService;

public class ViewAllUnApprovedPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService = new ManagerService();

		List<Person> unApprovedPersons = managerService.viewAllUnApprovedPerson();

		if (!unApprovedPersons.isEmpty()) {
			for (Person p : unApprovedPersons) {
				System.out.println(p.getPerson_id() + " " + p.getName() + " " + p.getStatus());
							
			}
		} else {
			System.out.println("No Such Person Found");
		}
	}

}
