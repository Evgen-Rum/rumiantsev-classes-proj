package classes;

import datastructures.DynArrImpl;
import datastructures.MyCollection;

public class Group implements Identifiable {
	private String groupName;
	private Teacher curator;
	private String specializ;
	private long id;
	private MyCollection students = new DynArrImpl();
	private static final int MAX_NUMBER_OF_STUDENTS = 8;

	public Group() {
		id = (long) (Math.random() * Long.MAX_VALUE);
	}

	public String toString() {
		String str = "[Group info: Name/number of the group - " + groupName + "; Specialization - " + specializ
				+ "; Number of students in the group - " + getNumOfStudents() + "; ID - " + id + "]" + "\n";
		if (curator != null) {
			str += "\n Group " + groupName + " curator: " + curator.toString() + "\n";
		}
		int counter = 1;
		for (int i = 0; i < students.size(); i++) {
			if (students.get() != null) {
				str += "\t" + counter + ") " + students.get() + "\n";
				counter++;
			}
		}
		return str;
	}

	public boolean addStudents(Student Stud) {
		if (students.size() >= MAX_NUMBER_OF_STUDENTS) {
			return false;
		} else {
			students.add(Stud);
			return true;
		}

//		if (numberOfStudents < students.length) {
//			for (int i = 0; i < students.length; i++) {
//				if (students[i] == null) {
//					students[i] = Stud;
//					numberOfStudents++;
//					return true;
//				}
//			}
//		}
//		return false;
	}

	public boolean removeStudents(Student Stud) {
		return students.remove(Stud);

//		for (int i = 0; i < students.length; i++) {
//			if (students[i] != null && students[i].getId() == id) {
//				students[i] = null;
//				numberOfStudents--;
//				return true;
//			} else {
//			}
//		}
//		return false;
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

	public long getId() {
		return id;
	}

	public int getNumOfStudents() {
		return students.size();
	}

	@Override
	public void numID() {
		getId();
	}
}
