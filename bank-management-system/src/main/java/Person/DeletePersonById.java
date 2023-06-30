package Person;

import com.jsp.service.PersonSerivce;

public class DeletePersonById {

	public static void main(String[] args) {
		PersonSerivce personSerivce=new PersonSerivce();
		boolean b=personSerivce.deletePersonById(2);
		if(b==true) {
			System.out.println("Person information is deleted");
		}else {
			System.out.println("Person not found , invalid id");
		}

	}

}
