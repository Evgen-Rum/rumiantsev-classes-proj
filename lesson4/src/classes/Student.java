package classes;

public class Student extends Person {
	private String faculty;
	private String position;
	private String marks;
	private String gMarks = "Good";
	private int scholarship;

	public String toString() {
		return "[Student info: Name - " + getFirstName() + " " + getLastName() + "; Marks - " + marks + "; ID - "
				+ getId() + "; Age - " + getAge() + "; faculty - " + faculty + "; Position - " + position
				+ "; Scholarship - " + scholarship + " BYN" + "]";
	}

	public boolean addScholarship(Student stud) {
		if (marks != null && marks.equals(gMarks)) {
			scholarship = 90;
			return true;
		} else {
			scholarship = 10;
		}
		return false;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		if (marks.equals(gMarks) || marks.equalsIgnoreCase("Bad")) {
			this.marks = marks;
		} else {
			System.out.println("Incorrect value!");
		}
	}
}
