package com.app.org;

public class Mgr extends Emp {
	private double performanceBonus;
	
	public Mgr(int id,String name,String deptId,double basic,double performanceBonus)
	{
		super(id,name,deptId,basic);
		this.performanceBonus=performanceBonus;
	}
	
	public double getperformanceBonus() {
		return performanceBonus;
	}
	
	@Override
	public double computeNetSalary() {
		return getBasic()+performanceBonus;
	}

	
	@Override
	public String toString() {
		return super.toString()+",Performance Bonus: "+performanceBonus +",Net Salary: "+computeNetSalary();
	}
	
}