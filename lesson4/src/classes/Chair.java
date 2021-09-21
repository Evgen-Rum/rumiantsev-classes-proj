package classes;

import java.math.BigDecimal;

public class Chair extends Employee {
	private static BigDecimal CostT = BigDecimal.valueOf(10);
	private static BigDecimal allCost = BigDecimal.valueOf(10);
	private int numberOfTeacher;
	private String chairName;
	private Teacher headOfChair;
	private Cleaner cleaner;
	public Teacher[] teachers = new Teacher[8];

	public String toString() {
		return "[Chair info: Name - " + getChairName() + "; Number of teachers - " + numberOfTeacher
				+ "; Head of chair -  " + getHeadOfChair() + ";\n" + " Cleaner - " + getCleaner() + "; All costs - " + allCost
				+ "]" + "\n";
	}

	public Teacher getHeadOfChair() {
		return headOfChair;
	}

	public void setHeadOfChair(Teacher teach) {
		this.headOfChair = teach;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner clean) {
		this.cleaner = clean;
	}

	public String getChairName() {
		return chairName;
	}

	public void setChairName(String chairName) {
		this.chairName = chairName;
	}

	public boolean removeTeachers(long id) {
		for (int i = 0; i < teachers.length; i++) {
			if (teachers[i] != null && teachers[i].getId() == id) {
				teachers[i] = null;
				numberOfTeacher--;
				return true;
			} else {
			}
		}
		return false;
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

	public boolean calcCostT(Teacher teach) {
		if (numberOfTeacher < teachers.length) {
			for (int i = 0; i < teachers.length; i++) {
				if (teachers[i] != null) {
					if (teachers[i].getAcademDegree().equals("Docent") && teachers[i].getAcademDegree() != null) {
						CostT.add(teachers[i].getSalary().add(teachers[i].getDegreePay()));
						return true;
					} else if (teachers[i].getAcademDegree().equals("Professor")
							&& teachers[i].getAcademDegree() != null) {
						CostT.add(teachers[i].getSalary().add(teachers[i].getDegreePay()));
						return true;
					} else if (teachers[i].getAcademDegree().equals("Head of chair")
							&& teachers[i].getAcademDegree() != null) {
						CostT.add(teachers[i].getSalary().add(teachers[i].getDegreePay()));
						return true;
					} else if (teachers[i].getAcademDegree() == null) {
						CostT.add(teachers[i].getSalary());
					}
				}
			}
		}
		return false;
	}

	public boolean calcCosts(Cleaner clean) {
		allCost.add(CostT);
		return true;
	}

}