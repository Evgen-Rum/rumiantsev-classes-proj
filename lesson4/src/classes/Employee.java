package classes;

public class Employee extends Person {
	private String position;
	private int salary;
	private int workHours;
	private int experience;
	private int prize;
	private double holidayPay;

	public double getHolidayPay() {
		return holidayPay;
	}

	public void setHolidayPay(double holidayPay) {
		this.holidayPay = holidayPay;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}
