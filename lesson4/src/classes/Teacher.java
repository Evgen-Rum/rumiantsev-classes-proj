package classes;

public class Teacher extends Employee {

	private String subjects;

	public String toString() {
		return "[Employee info: Name - " + getFirstName() + " " + getLastName() + "; ID - " + getId() + "; Age - "
				+ getAge() + "; Academic degree - " + getAcademDegree() + "; Position - " + getPosition()
				+ "; Salary - " + getSalary() + " BYN" + "]";
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

}
