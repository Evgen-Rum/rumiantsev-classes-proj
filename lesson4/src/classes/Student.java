package classes;

public class Student extends Person implements Identifiable {
	private String faculty;
	private String position;
	private String marks;
	private String gMarks = "Good";
	private int scholarship;

	public String toString() {
		return "[Student info: Marks - " + marks + "; ID - " + getId() + "; faculty - " + faculty + "; Position - "
				+ position + "; Scholarship - " + scholarship + " BYN" + "]";
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
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

	public boolean addScholarship(Student stud) {
		if (marks != null && marks.equals(gMarks)) {
			scholarship = 90;
			return true;
		} else {
			scholarship = 10;
		}
		return false;

	}

	@Override
	public void numID() {
		// TODO Auto-generated method stub
		getId();
	}
}
