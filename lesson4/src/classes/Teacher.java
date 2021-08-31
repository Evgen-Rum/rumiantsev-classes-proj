package classes;

public class Teacher {
	private String firstName;
	private String lastName;
	private String department;
	private String position;
	private int salary;
	private int age;
	private long id;
	public Teacher(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
 		id = (long) (Math.random() * Long.MAX_VALUE);
	}
	public Teacher() {
		id = (long) (Math.random() * Long.MAX_VALUE);
	}
	public String toString() {
		String str = "[Employee info: Name - " + firstName + " " + lastName + "; ID - " + id +
				"; Age - " + age + "; Department - " + department + "; Position - " + position 
				+ "; Salary - " + salary + " BYN" + "]";
		return str;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 20 && age < 100) {
		this.age = age;
		} else {
			System.out.println("Incorrect age!");
		}
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary (int salary) {
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
}
