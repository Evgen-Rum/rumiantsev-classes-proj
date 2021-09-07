package classes;

public class Teacher extends Employee {


	public String toString() {
		return "[Employee info: Name - " + getFirstName() + " " + getLastName() + "; ID - " + getId() + "; Age - "
				+ getAge() + "; Academic degree - " + getAcademDegree() + "; Position - " + getPosition()
				+ "; Salary - " + getSalary() + " BYN" +  "; Experience - " + getExperience() + "]";
	}



}
