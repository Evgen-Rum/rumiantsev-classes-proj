package classes;

import java.math.BigDecimal;

public class AccountantUtil extends Employee {
	public boolean addAcademicPay(Employee empl) {
		if (getAcademDegree().equals("Docent") && getAcademDegree() != null) {
			empl.setDegreePay(100);
			return true;
		} else if (getAcademDegree().equals("Professor") && getAcademDegree() != null) {
			empl.setDegreePay(300);
			return true;
		} else if (getAcademDegree().equals("Head of chair") && getAcademDegree() != null) {
			empl.setDegreePay(200);
			return true;
		}
		return false;
	}

	public boolean addSalary(Employee empl) {
		if (getPosition().equals("Cleaner") && getPosition() != null) {
			if (getExperience() > 0 && getExperience() < 5) {
				empl.setSalary(BigDecimal.valueOf(200));
				return true;
			} else if (getExperience() > 5 && getExperience() < 10) {
				empl.setSalary(BigDecimal.valueOf(800));
				return true;
			} else if (getExperience() > 10) {
				empl.setSalary(BigDecimal.valueOf(1100));
				return true;
			} else {
				return false;
			}
		} else if (getPosition().equals("Teacher") && getPosition() != null) {
			if (getExperience() > 0 && getExperience() < 5) {
				empl.setSalary(BigDecimal.valueOf(1000));
				return true;
			} else if (getExperience() > 5 && getExperience() < 10) {
				empl.setSalary(BigDecimal.valueOf(1500));
				return true;
			} else if (getExperience() > 10) {
				empl.setSalary(BigDecimal.valueOf(2000));
				return true;
			}
		}
		return false;
	}

	public boolean addPrize(Employee empl) {
		if (getExperience() > 0 && getExperience() < 15) {
			empl.setPrize(getSalaryI() / 3);
			return true;
		} else if (getExperience() > 15) {
			empl.setPrize(getSalaryI() / 3);
			return true;
		} else {
			return false;
		}
	}

	public boolean addHolidayPay(Employee empl) {
		empl.setHolidayPay(getSalaryI() * 2.5);
		return true;
	}

}
