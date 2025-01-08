package que2;

import java.util.Scanner;

public class student 
{
 String name;
 int roll;
 double marks;

 public student()
 {
    this.name="ABC";
    this.roll= 0;
    this.marks= 0.0; 
}

 public void acceptStudentDetails()
 {
    Scanner sc = new Scanner(System.in);

    System.out.print("Name of the student :");
    this.name= sc.nextLine();

    System.out.print("Roll no. :");
    this.roll= sc.nextInt();

    System.out.print("Marks obtained :");
    this.marks= sc.nextDouble();
}
 public void printStudentDetails()
 {
    System.out.println("Name of the student" + name);
    System.out.println("Roll no. :"+ roll);
    System.out.println("Marks Obtained :"+ marks);
 }

 public static void main (String[] args)
 {
	 Scanner sc= new Scanner (System.in);
    student student = new student();
    int choice;
    do {
    	System.out.println("\n--- Student Menu ---");
        System.out.println("1. Initialize Student with Default Values");
        System.out.println("2. Accept Student Details");
        System.out.println("3. Print Student Details");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice= sc.nextInt();
       
        switch(choice)
        {
        case 1:
            student = new student(); // Reinitialize with default values
            System.out.println("Student initialized with default values.");
            student.printStudentDetails();
            break;

        case 2:
            student.acceptStudentDetails();
            break;

        case 3:
            student.printStudentDetails();
            break;

        case 4:
            System.out.println("Exiting program. Goodbye!");
            break;

        default:
            System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 4);
    
    sc.close();
  }
}
 
