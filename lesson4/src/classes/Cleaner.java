package classes;

public class Cleaner extends Employee implements Identifiable {
	private int classrooms;
	private String schedule;

	public String toString() {
		return "[Cleaner info: My schedule - " + getSchedule() + "; Salary - " + getSalary() + "; Prize - " + getPrize() 
		+ "]";
	}

	public int getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(int classrooms) {
		this.classrooms = classrooms;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public void numID() {
		// TODO Auto-generated method stub
		getId();
	}
}
