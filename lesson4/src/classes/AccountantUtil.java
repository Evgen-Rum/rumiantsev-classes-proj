package classes;

import java.math.BigDecimal;

public class AccountantUtil extends Employee {

	public static boolean addAcademicPay(Teacher teach) {
		if (teach.getAcademDegree().equals("Docent") && teach.getAcademDegree() != null) {
			teach.setDegreePay(BigDecimal.valueOf(100));
			return true;
		} else if (teach.getAcademDegree().equals("Professor") && teach.getAcademDegree() != null) {
			teach.setDegreePay(BigDecimal.valueOf(300));
			return true;
		} else if (teach.getAcademDegree().equals("Head of chair") && teach.getAcademDegree() != null) {
			teach.setDegreePay(BigDecimal.valueOf(500));
			return true;
		}
		return false;
	}

	public static boolean addSalary(Employee empl) {
		if (empl.getPosition().equals("Cleaner") && empl.getPosition() != null) {
			if (empl.getExperience() >= 0 && empl.getExperience() <= 7) {
				empl.setSalary(BigDecimal.valueOf(200).add(empl.getPrize()));
				return true;
			} else if (empl.getExperience() > 7 && empl.getExperience() < 15) {
				empl.setSalary(BigDecimal.valueOf(800).add(empl.getPrize()));
				return true;
			} else if (empl.getExperience() >= 15) {
				empl.setSalary(BigDecimal.valueOf(1100).add(empl.getPrize()));
				return true;
			}
		} else if (empl.getPosition().equals("Teacher") && empl.getPosition() != null) {
			if (empl.getExperience() > 0 && empl.getExperience() < 7) {
				empl.setSalary(BigDecimal.valueOf(1000).add(empl.getPrize().add(empl.getDegreePay())));
				return true;
			} else if (empl.getExperience() > 7 && empl.getExperience() < 15) {
				empl.setSalary(BigDecimal.valueOf(1500).add(empl.getPrize().add(empl.getDegreePay())));
				return true;
			} else if (empl.getExperience() > 15) {
				empl.setSalary(BigDecimal.valueOf(2000).add(empl.getPrize().add(empl.getDegreePay())));
				return true;
			}
		}
		return false;
	}

	public static boolean addPrize(Employee empl) {
		if (empl.getPosition().equals("Teacher")) {
			if (empl.getExperience() >= 5 && empl.getExperience() <= 10) {
				empl.setPrize(BigDecimal.valueOf(100));
				return true;
			} else if (empl.getExperience() > 10 && empl.getExperience() < 15) {
				empl.setPrize(BigDecimal.valueOf(200));
				return true;
			} else if (empl.getExperience() >= 15) {
				empl.setPrize(BigDecimal.valueOf(300));
				return true;
			}
		} else if (empl.getPosition().equals("Cleaner")) {
			if (empl.getExperience() >= 5 && empl.getExperience() <= 10) {
				empl.setPrize(BigDecimal.valueOf(50));
				return true;
			} else if (empl.getExperience() > 10 && empl.getExperience() < 15) {
				empl.setPrize(BigDecimal.valueOf(100));
				return true;
			} else if (empl.getExperience() >= 15) {
				empl.setPrize(BigDecimal.valueOf(150));
				return true;
			}
		}
		return false;
	}

	public static boolean addHolidayPayT(Teacher teach) {
		teach.setHolidayPay(teach.getSalary().multiply(teach.getSalary().divide(teach.getSalary(), 2)));
		return true;
	}

	public static boolean addHolidayPayC(Cleaner clean) {
		clean.setHolidayPay(clean.getSalary().multiply(clean.getSalary().divide(clean.getSalary(), 2)));
		return true;
	}

}
