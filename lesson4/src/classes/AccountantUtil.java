package classes;

public class AccountantUtil extends Employee {
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
