package com.app.org;

public abstract class Emp {
	private int id;
	private String name;
	private String deptId;
	private double basic;
	
	public Emp(int id,String name,String deptId,double basic){
		this.id=id;
		this.name=name;
		this.deptId=deptId;
		this.basic=basic;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String deptId() {
		return deptId;
	}
	
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic=basic;
	}
	
	public abstract double computeNetSalary();
	
	@Override
	public String toString() {
		return "ID:"+id+",Name:"+name+",Department:"+deptId+",Basic Salary:"+basic;
		
	}
	

}