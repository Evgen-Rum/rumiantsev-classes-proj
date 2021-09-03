package classes;

public class AccountantUtil extends Employee {
	public boolean addAcademicPay(Employee empl) {
		if (getAcademDegree().equals("Docent") && getAcademDegree() != null) {
			empl.setDegreePay(100);
			return true;
		} else if (getAcademDegree().equals("Professor") && getAcademDegree() != null) {
			empl.setDegreePay(300);
			return true;
		}
		return false;
	}

	public boolean addSalary(Employee empl) {
		if (getPosition().equals("Cleaner") && getPosition() != null) {
			if (getExperience() > 0 && getExperience() < 5) {
				empl.setSalary(500);
				return true;
			} else if (getExperience() > 5 && getExperience() < 10) {
				empl.setSalary(800);
				return true;
			} else if (getExperience() > 10) {
				empl.setSalary(1100);
				return true;
			} else {
				return false;
			}
		} else if (getPosition().equals("Teacher") && getPosition() != null) {
			if (getExperience() > 0 && getExperience() < 5) {
				empl.setSalary(1000);
				return true;
			} else if (getExperience() > 5 && getExperience() < 10) {
				empl.setSalary(1500);
				return true;
			} else if (getExperience() > 10) {
				empl.setSalary(2000);
				return true;
			}
		}
		return false;
	}

	public boolean addPrize(Employee empl) {
		if (getExperience() > 0 && getExperience() < 15) {
			empl.setPrize(getSalary() / 3);
			return true;
		} else if (getExperience() > 15) {
			empl.setPrize(getSalary() / 2);
			return true;
		} else {
			return false;
		}
	}

	public boolean addHolidayPay(Employee empl) {
		empl.setHolidayPay(getSalary() * 2.5);
		return true;
	}

}
