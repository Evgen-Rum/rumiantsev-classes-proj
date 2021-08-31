package classes;

public class Student {
	private String firstName;
	private String lastName;
	private String faculty;
	private String position;
	private String marks;
	private String gMarks = "Good";
	private int scholarship;
	private int ageS;
	long id;
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		id = (long) (Math.random() * Long.MAX_VALUE);
	}
	public Student() {
		id = (long) (Math.random() * Long.MAX_VALUE);
	}
	public String toString() {
		String str = "[Student info: Name - " + firstName + " " + lastName + "; Marks - " + marks + "; ID - " + id +
				"; Age - " + ageS + "; faculty - " + faculty + "; Position - " + position 
				+ "; Scholarship - " + scholarship +  " BYN" + "]";
		return str;
	}
	public int getAgeS() {
		return ageS;
	}
	public void setAgeS(int ageS) {
		if (ageS > 16 && ageS < 50) {
		this.ageS = ageS;
		} else {
			System.out.println("Incorrect age!");
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
	public long getId() {
		return id;
	}
}
