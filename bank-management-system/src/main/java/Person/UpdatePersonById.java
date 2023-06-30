package Person;

import com.jsp.dto.Person;
import com.jsp.service.PersonSerivce;

public class UpdatePersonById {

	public static void main(String[] args) {
		PersonSerivce personSerivce= new PersonSerivce();
		Person p1= new Person();
		p1.setName("kantishanti");
		p1.setEmail("kantishantilal@gmail");
		p1.setGender("male");
		p1.setStatus("unapproved");
		Person updatedPerson= personSerivce.updatePersonById(3, p1);
		if(updatedPerson!=null) {
			System.out.println("=================================");
			System.out.println(p1.getName()+"  "+ p1.getEmail()+"  "+ p1.getGender()+"  "+p1.getStatus());

			System.out.println("=================================");
		}else {

			System.out.println("=================================");
			System.out.println("Invalid id of person");

			System.out.println("=================================");
		}
	}

}
