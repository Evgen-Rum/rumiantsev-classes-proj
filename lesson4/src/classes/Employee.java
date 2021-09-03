package classes;

import java.math.BigDecimal;

public class Employee extends Person {
	private String position;
	private int salaryI;
	private BigDecimal salary = new BigDecimal(10);
	private int experience;
	private int prize;
	private double holidayPay;
	private String academDegree;
	private int degreePay;

	public int getDegreePay() {
		return degreePay;
	}

	public void setDegreePay(int degreePay) {
		this.degreePay = degreePay;
	}

	public String getAcademDegree() {
		return academDegree;
	}

	public void setAcademDegree(String academDegree) {
		this.academDegree = academDegree;
	}

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

	public BigDecimal getSalary() {
		return salary;
	}

	public int getSalaryI() {
		return salaryI;
	}

	public void setSalaryI(int salaryI) {
		this.salaryI = salaryI;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}
