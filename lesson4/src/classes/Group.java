package classes;

public class Group {
	private String groupName;
	private Teacher curator;
	private String specializ;
	private int numberOfStudents;
	private long id;
	private Student[] students = new Student[18];

	public Group() {
		id = (long) (Math.random() * Long.MAX_VALUE);
	}

	public String toString() {
		String str = "[Group info: Name/number of the group - " + groupName + "; Specialization - " + specializ
				+ "; Number of students in the group - " + numberOfStudents + "; ID - " + id + "]" + "\n";
		if (curator != null) {
			str += "\n Group " + groupName + " curator: " + curator.toString() + "\n";
		}
		int counter = 1;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				str += "\t" + counter + ") " + students[i].toString() + "\n";
				counter++;
			}
		}
		return str;
	}

	public boolean addStudents(Student Stud) {
		if (numberOfStudents < students.length) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = Stud;
					numberOfStudents++;
					return true;
				}
			}
		}
		return false;
	}

	public boolean removeStudents(long id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id) {
				students[i] = null;
				numberOfStudents--;
				return true;
			} else {
			}
		}
		return false;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Teacher getCurator() {
		return curator;
	}

	public void setCurator(Teacher curator) {
		this.curator = curator;
	}

	public String getSpecializ() {
		return specializ;
	}

	public void setSpecializ(String specializ) {
		this.specializ = specializ;
	}
}
