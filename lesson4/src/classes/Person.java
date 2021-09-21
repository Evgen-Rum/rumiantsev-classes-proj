package classes;

import java.util.Random;

public abstract class Person {
	private String firstName;
	private String lastName;
	private int age;
	private long id;

	Random rand = new Random();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId() {
		this.id = (long) (Math.random() * Long.MAX_VALUE);
	}

	public String intoducedYourself() {
		return "My name: " + firstName + " " + lastName + ", my age: " + age + ".";
	}
}
