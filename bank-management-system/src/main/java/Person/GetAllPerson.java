package Person;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.PersonSerivce;

public class GetAllPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonSerivce personSerivce = new PersonSerivce();
		List<Person> persons = personSerivce.getAllPerson();
		if (!persons.isEmpty()) {
			for (Person p : persons) {
				System.out.println(p.getPerson_id() + " " + p.getName() + " " + p.getStatus() + " " + p.getGender());
				
			}
		}else {
			System.out.println("person not found");
		}

	}

}
