package Person;

import java.util.ArrayList;

import com.jsp.dto.Pan;
import com.jsp.dto.Person;
import com.jsp.service.PersonSerivce;

public class SavePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonSerivce personSerivce= new PersonSerivce();
		Person person= new Person();
		person.setName("laxman");
		person.setEmail("lax@gmail.com");
		person.setGender("male");
		person.setStatus("unapproved");
		Pan pan = new Pan();
		pan.setPan_number("lax12345");
		pan.setPerson(person);
		person.setPan(pan);
		
		 Person person1= new Person();
			person1.setName("abc");
			person1.setEmail("abc@gmail.com");
			person1.setGender("male");
			person1.setStatus("unapproved");
			Pan pan1 = new Pan();
			pan1.setPan_number("adc12345");
			pan1.setPerson(person1);
		 person1.setPan(pan1);
		 
		 
		 ArrayList<Person> persons= new ArrayList<>();
		 persons.add(person);
		 persons.add(person1);
		 ArrayList<Pan> pans= new ArrayList<>();
		 pans.add(pan);
		 pans.add(pan1);
		 
		
	Person p1=personSerivce.savePersonDetails(person);
	Person p2=personSerivce.savePersonDetails(person1);
	if(p1!=null) {
		System.out.println("saved");
	}else {
		System.out.println("not saved");
	}
	if(p2!=null) {
		System.out.println("saved");
	}else {
		System.out.println("not saved");
	}

	}

}
