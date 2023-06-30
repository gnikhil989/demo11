package Manager;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.ManagerService;

public class ViewAllPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService = new ManagerService();

		List<Person> persons = managerService.viewAllPerson();

		if (!persons.isEmpty()) {
			for (Person p : persons) {
				System.out.println(p.getPerson_id() + " " + p.getName() + " " + p.getEmail() + " " + p.getStatus());
			}
		} else {
			System.out.println("Persons Not Found");
		}
	}

}
