package assign4;

import java.time.LocalDate;

public class Student {

	public String rollNo;
	public String Name;
	public LocalDate dob;
	public  Subject subject; 
	private double gpa;
	
	
	public Student(String rollNo, String name, LocalDate dob, Subject subject, double gpa) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
	}


	public String getRollNo() {
		return rollNo;
	}


	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", dob=" + dob + ", subject=" + subject + ", gpa=" + gpa
				+ "]";
	}
	
	
	
	
	
}
