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

	public static boolean addSalaryC(Cleaner clean) {
		if (clean.getPosition().equals("Cleaner") && clean.getPosition() != null) {
			if (clean.getExperience() > 0 && clean.getExperience() < 7) {
				clean.setSalary(BigDecimal.valueOf(200).add(clean.getPrize()));
				return true;
			} else if (clean.getExperience() > 7 && clean.getExperience() < 15) {
				clean.setSalary(BigDecimal.valueOf(800).add(clean.getPrize()));
				return true;
			} else if (clean.getExperience() > 15) {
				clean.setSalary(BigDecimal.valueOf(1100).add(clean.getPrize()));
				return true;
			}
		}
		return false;
	}

	public static boolean addSalaryT(Teacher teach) {
		if (teach.getPosition().equals("Teacher") && teach.getPosition() != null) {
			if (teach.getExperience() > 0 && teach.getExperience() < 7) {
				teach.setSalary(BigDecimal.valueOf(1000).add(teach.getPrize().add(teach.getDegreePay())));
				return true;
			} else if (teach.getExperience() > 7 && teach.getExperience() < 15) {
				teach.setSalary(BigDecimal.valueOf(1500).add(teach.getPrize().add(teach.getDegreePay())));
				return true;
			} else if (teach.getExperience() > 15) {
				teach.setSalary(BigDecimal.valueOf(2000).add(teach.getPrize().add(teach.getDegreePay())));
				return true;
			}
		}
		return false;
	}

	public static boolean addPrizeT(Teacher teach) {
		if (teach.getExperience() > 0 && teach.getExperience() < 15) {
			teach.setPrize(teach.getSalary().divide(teach.getSalary(), 3));
			return true;
		} else if (teach.getExperience() > 15) {
			teach.setPrize(teach.getSalary().divide(teach.getSalary(), 2));
			return true;
		} else {
			return false;
		}
	}

	public static boolean addPrizeC(Cleaner clean) {
		if (clean.getExperience() > 0 && clean.getExperience() < 15) {
			clean.setPrize(clean.getSalary().divide(clean.getSalary(), 3));
			return true;
		} else if (clean.getExperience() > 15) {
			clean.setPrize(clean.getSalary().divide(clean.getSalary(), 2));
			return true;
		} else {
			return false;
		}
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
