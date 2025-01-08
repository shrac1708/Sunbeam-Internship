package que3;
import java.util.Scanner;
public class cylinder {
	double radius;
	double height;
	
	public cylinder() {
		this.radius=0.0;
		this.height=0.0;
	}
	
	public cylinder(double radius, double height) {
		this.radius=radius;
		this.height=height;
	}
	
	public double getradius() {
		return radius;
	}
	
	public void setradius(double radius) {
		this.radius=radius;
		
	}
	
	public double getheight() {
		return height;
	}
	
	public void setheight(double height) {
		this.height=height;
	}
	
	public double getvolume() {
		return 3.14 * radius * radius * height;
	}
	
	public void printvolume() {
		System.out.printf("The volume of cylinder is : " + getvolume());
	}
	
	public void acceptvalues() {
		Scanner sc= new Scanner(System.in);
		
		System.out.printf("The radius od cylinder:", radius);
		this.radius= sc.nextDouble();
		
		System.out.printf("The height of cylinder:", height);
		this.height= sc.nextDouble();
				
	}
	
	public static void main (String[] args) {
		cylinder dcy = new cylinder();
		System.out.println("Default Cylinder");
		dcy.printvolume();
		
		cylinder pcy = new cylinder(5,7);
		System.out.println("\n\nParameterized Cylinder");
		pcy.printvolume();
		
		cylinder acy= new cylinder();
		System.out.println("\n\nThe user given values");
		acy.acceptvalues();
		acy.printvolume();
	}

}
