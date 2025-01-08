package que1;

import java.util.Scanner;

public class date {
	
     int day;
     int month;
     int year;
	

    public void initdate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public void acceptdate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        this.day = sc.nextInt();

        System.out.print("Enter month: ");
        this.month = sc.nextInt();

        System.out.print("Enter year: ");
        this.year = sc.nextInt();
    }

    
    public void printdate() {
        System.out.printf("Date: %02d/%02d/%04d%n", day, month, year);
    }

    
    public static void main(String[] args) {
        date date = new date();
        
        System.out.println("\nAccepting date from user...");
        date.acceptdate(); 
        date.printdate();
    }
}

