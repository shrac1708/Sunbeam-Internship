package com.app.org;

public class Worker extends Emp {
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(int id,String name,String deptId,double basic,int hoursWorked,double hourlyRate) {
		
		super(id,name,deptId,basic);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	public int gethoursWorked() {
		return hoursWorked;
	}
	
	public double gethourlyRate() {
		return hourlyRate;
	}

	@Override
	public double computeNetSalary() {
		// TODO Auto-generated method stub
		return getBasic()+(hoursWorked*hourlyRate);
	}
	@Override
	public String toString() {
		return super.toString()+",Hours Worked:"+hoursWorked+",Hourly Rate:"+ hourlyRate+",Net Salary:"+computeNetSalary();
		
	}

}