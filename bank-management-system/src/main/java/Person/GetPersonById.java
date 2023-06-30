package Person;

import com.jsp.dto.Person;
import com.jsp.service.PersonSerivce;

public class GetPersonById {

	public static void main(String[] args) {
		PersonSerivce personSerivce= new PersonSerivce();
		Person p1=personSerivce.getPersonById(1);
		if(p1!=null) {
			System.out.println("==========================================================");
			
			System.out.println(p1.getName()+"  "+ p1.getEmail()+"  "+p1.getGender()+"  "+ p1.getStatus());
			
			
			System.out.println("==================================================================");
		}else {
			System.out.println("==========================================================");
			
			System.out.println("Invalid id of person");
			System.out.println("==========================================================");
			
		}

	}

}
