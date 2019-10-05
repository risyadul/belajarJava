package TugasKedelapan;

import java.util.*;

public class PersonMain {
	
	public static void main(String[] args) {

		List<Person> person = new ArrayList<Person>();
		Person owo = new Person("owo", 12, "Male");
		Person owi = new Person("owi", 14, "Male");
		Person kampret = new Person("kampret", 14, "Female");
		owo.addFriends(owi);
		owo.addFriends(kampret);
		owi.addFriends(kampret);
		System.out.println(owo.toString());
		
	}
}