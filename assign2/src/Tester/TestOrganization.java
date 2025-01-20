package Tester;

import com.app.org.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestOrganization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Emp> employees = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Hire Manager");
            System.out.println("2. Hire Worker");
            System.out.println("3. Display information of all employees");
            System.out.println("4. Update basic salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            switch (sc.nextInt()) {
                case 1: 
                    System.out.print("Enter Manager Details (id, name, deptId, basic, performanceBonus): ");
                    employees.add(new Mgr(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble()));
                    break;

                case 2:
                    System.out.print("Enter Worker Details (id, name, deptId, basic, hoursWorked, hourlyRate): ");
                    employees.add(new Worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble()));
                    break;

                case 3: 
                    System.out.println("Employee Details:");
                    for (Emp emp : employees) {
                        System.out.println(emp);
                    }
                    break;

                case 4: 
                    System.out.print("Enter Employee ID to update basic salary: ");
                    int idToUpdate = sc.nextInt();
                    boolean found = false;
                    for (Emp emp : employees) {
                        if (emp.getId() == idToUpdate) {
                            System.out.print("Enter new basic salary: ");
                            emp.setBasic(sc.nextDouble());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 5: 
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        sc.close();
        }
     }

