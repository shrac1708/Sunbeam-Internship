package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter basket size: ");
        int basketSize = scanner.nextInt();
        Fruit[] basket = new Fruit[basketSize];
        int counter = 0;

        while (true) {
            
            System.out.println("\n--- Menu ---");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of all fresh fruits");
            System.out.println("6. Display tastes of all stale fruits");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 0: 
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                case 1: 
                    if (counter < basketSize) {
                        System.out.print("Enter Mango weight: ");
                        double weight = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter Mango color: ");
                        String color = scanner.nextLine();
                        System.out.print("Enter Mango isFresh: ");
                        boolean isFresh = scanner.nextBoolean();
                        basket[counter++] = new mango("Mango", weight, color, true);
                        System.out.println("Mango added!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2: 
                    if (counter < basketSize) {
                        System.out.print("Enter Orange weight: ");
                        double weight = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter Orange color: ");
                        String color = scanner.nextLine();   
                        System.out.print("Enter Orange isFresh: ");
                        boolean isFresh = scanner.nextBoolean();
                        basket[counter++] = new orange("Orange", weight, color, true);
                        System.out.println("Orange added!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3: 
                    if (counter < basketSize) {
                        System.out.print("Enter Apple weight: ");
                        double weight = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter Apple color: ");
                        String color = scanner.nextLine();
                        System.out.print("Enter Apple isFresh: ");
                        boolean isFresh = scanner.nextBoolean();
                        basket[counter++] = new Apple("Apple", weight, color, true);
                        System.out.println("Apple added!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4: 
                    System.out.println("Fruits in the basket:");
                    for (Fruit fruit : basket) {
                        if (fruit != null) {
                            System.out.println(fruit.getName());
                        }
                    }
                    break;

                case 5: 
                	System.out.println("Fresh fruits:");
                    boolean isFresh = false; 
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.isFresh()) { 
                            System.out.println(fruit + ", Taste: " + fruit.taste());
                            isFresh = true; // At least one fresh fruit is found
                        }
                    }
                    if (!isFresh) {
                        System.out.println("No fresh fruits in the basket.");
                    }
                    break;

                case 6: 
                    System.out.println("Tastes of stale fruits: Bitter");
                    for (Fruit fruit : basket) {
                        if (fruit != null && !fruit.isFresh()) {
                            System.out.println(fruit.getName() + ": " + fruit.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
