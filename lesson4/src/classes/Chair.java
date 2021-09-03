package classes;

public class Chair {
	private String chairName;
	private int numberOfTeacher;
	private String headOfChair;
	private String cleaner;
	private Teacher[] teachers = new Teacher[8];

	public String getHeadOfChair() {
		return headOfChair;
	}

	public void setHeadOfChair(String headOfChair) {
		this.headOfChair = headOfChair;
	}

	public String getCleaner() {
		return cleaner;
	}

	public void setCleaner(String cleaner) {
		this.cleaner = cleaner;
	}

	public String getChairName() {
		return chairName;
	}

	public void setChairName(String chairName) {
		this.chairName = chairName;
	}

	public boolean addTeacher(Teacher teach) {
		if (numberOfTeacher < teachers.length) {
			for (int i = 0; i < teachers.length; i++) {
				if (teachers[i] == null) {
					teachers[i] = teach;
					numberOfTeacher++;
					return true;
				}
			}
		}
		return false;
	}
}
