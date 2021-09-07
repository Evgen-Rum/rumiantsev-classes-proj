package classes;

import java.math.BigDecimal;

public abstract class Employee extends Person {
	private String position;
	private String subjects;
	private String academDegree;
	private int experience;
	private BigDecimal salary = BigDecimal.valueOf(10);
	private BigDecimal prize = BigDecimal.valueOf(10);
	private BigDecimal holidayPay = BigDecimal.valueOf(10);
	private BigDecimal degreePay = BigDecimal.valueOf(10);

	public BigDecimal getDegreePay() {
		return degreePay;
	}

	public void setDegreePay(BigDecimal degreePay) {
		this.degreePay = degreePay;
	}

	public String getAcademDegree() {
		return academDegree;
	}

	public void setAcademDegree(String academDegree) {
		this.academDegree = academDegree;
	}

	public BigDecimal getHolidayPay() {
		return holidayPay;
	}

	public void setHolidayPay(BigDecimal holidayPay) {
		this.holidayPay = holidayPay;
	}

	public BigDecimal getPrize() {
		return prize;
	}

	public void setPrize(BigDecimal prize) {
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

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
}
