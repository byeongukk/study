package com.kh.silsub2.salary.model.vo;

public abstract class Salary {
	private String name;
	private long pay;
	private long familyP;
	private long overtimeP;
	private long incenP;
	private long tax;
	private long totalPay;
	private int family;
	private int overtime;
	static private float incentive = 0.5f;
	static private int count = 0;
	
	public Salary() {}
	public Salary(String name,long pay,int family,int overtime) {
		count++;
		this.name = name;
		this.pay = pay;
		this.family = family;
		this.overtime = overtime;
	}
	public String getName() {
		return name;
	}
	public long getPay() {
		return pay;
	}
	public long getFamilyP() {
		return familyP;
	}
	public long getOvertimeP() {
		return overtimeP;
	}
	public long getIncenP() {
		return incenP;
	}
	public long getTax() {
		return tax;
	}
	public long getTotalPay() {
		return totalPay;
	}
	public int getFamily() {
		return family;
	}
	public int getOvertime() {
		return overtime;
	}
	public static float getIncentive() {
		return incentive;
	}
	public static int getCount() {
		return count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	public void setFamilyP(long familyP) {
		this.familyP = familyP;
	}
	public void setOvertimeP(long overtimeP) {
		this.overtimeP = overtimeP;
	}
	public void setIncenP(long incenP) {
		this.incenP = incenP;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}
	public void setFamily(int family) {
		this.family = family;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}
	public static void setCount(int count) {
		Salary.count = count;
	}
}
