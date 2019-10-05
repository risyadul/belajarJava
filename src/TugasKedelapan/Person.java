package TugasKedelapan;
import java.util.*;

public class Person {
	private String name;
	private Integer age;
	private String gender;
	private List<Person> teman = new ArrayList<Person>();
	
	public Person() {};
	
	public Person(String name, Integer age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public List<Person> getTeman() {
		return teman;
	}



	public void setTeman(List<Person> teman) {
		this.teman = teman;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teman == null) ? 0 : teman.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teman == null) {
			if (other.teman != null)
				return false;
		} else if (!teman.equals(other.teman))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", teman=" + teman + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getTeman()=" + getTeman()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	public boolean isAFriend(Person person) {
		if (teman.contains(person)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removeFriend(Person friend) {
		if (teman.remove(friend)) {
			return true;
		}else {
			return false;
		}
	}
	
//	public Person addFriend(Person friend) {
//		teman.add(friend);
//	}
	
	public List<Person> addFriends(Person friends) {
		teman.add(friends);
		return teman;
	}
	
	public List<Person> getMutualFriends(Person friend) {
		List<Person> temp = new ArrayList<Person>();
		for (int i = 0; i < friend.getTeman().size(); i++) {
			if (this.teman.contains(friend.getTeman().get(i))) {
				temp.add(friend.getTeman().get(i));
			}
		}
		return temp;
	}


}
