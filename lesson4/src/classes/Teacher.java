package classes;

public class Teacher extends Employee implements Identifiable {

	public String toString() {
		return "[Employee info:  ID - " + getId() + "; Academic degree - " + getAcademDegree() + "; Position - "
				+ getPosition() + "; Salary - " + getSalary() + " BYN" + "; Experience - " + getExperience()
				+ "; Prize - " + getPrize() + "]";
	}

	@Override
	public void numID() {
		// TODO Auto-generated method stub
		getId();
	}

}
