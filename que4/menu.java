package que4;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        
        int[] prices = {40, 20, 30, 15, 12}; 
        int totalBill = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("\n--- Food Menu ---");
            System.out.println("1. Dosa       - Rs.40");
            System.out.println("2. Samosa     - Rs.20");
            System.out.println("3. Idli       - Rs.30");
            System.out.println("4. VadaPav    - Rs.15");
            System.out.println("5. Tea        - Rs.12");
            System.out.println("6. Generate Bill");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            
            if (choice == 6) {
                System.out.println("\nTotal Bill: ₹" + totalBill);
                System.out.println("Thank you for ordering!");
                break;
            }

            
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            
            totalBill += prices[choice - 1] * quantity;
        }

        scanner.close();
    }
}
