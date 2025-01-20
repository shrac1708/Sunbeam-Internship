package tryCatch;

import java.util.HashSet;
import java.util.Scanner;

class Account{
	public int accountNumber;
	public String name;
	public String email;
	public int phone;
	public double balance;
	
	Account(int accountNumber,String name,String email, int phone, double balance){
		this.accountNumber=accountNumber;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.balance=balance;
	}
	
	public String toString() {
		return accountNumber+"accountNumber"+name+"name"+email+"email"+ phone+"phone"+ balance+"balance";
	}
	public String getDetails() {
		return toString();
	}
	public double withdraw(double amount) {
		return balance-amount;
	}
	public double deposite(double amount) {
		return balance+amount;
	}
}

 class accountNotaccount extends Exception{
	public accountNotaccount(String message) {
		super(message);
	}
}




public class Ebank{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Account>acc = new HashSet<>();
		
		int ch;
		 int accountNumber;
		 String name;
		 String email;
		 int phone;
		 double balance;
		 int findacc;
		
		do {
			
		
		System.out.println("menu");
		System.out.println("1. Add Account");
		System.out.println("2. Display an Account ");
		System.out.println("3. Display All Accounts ");
		System.out.println("4. Remove an Account ");
		System.out.println("5. withdraw  ");
		System.out.println("6. deposit  ");
		System.out.println("7. transfer ");
		System.out.println("8. search account using name ");
		System.out.println("9. search account using email ");
		System.out.println("10. search account using phone ");
		System.out.println("11. exit.");
		
		System.out.println("enter your choice:");
		ch = sc.nextInt();
		
		switch(ch) {
		 
		case 1:
			System.out.println("enter account no.:");
			accountNumber = sc.nextInt();
			System.out.println("enter name.:");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("enter email.:");
			sc.nextLine();
			email = sc.nextLine();
			System.out.println("enter mobile no.:");
			phone = sc.nextInt();
			System.out.println("enter balance:");
			balance = sc.nextDouble();
			acc.add(new Account(accountNumber,name,email , phone , balance));
			break;
			
		case 2:
			System.out.println("enter account no.:");
			 findacc = sc.nextInt();
			 try {
				 boolean found = false;
				 for(Account account : acc) {
						if(account.accountNumber==findacc) {
							System.out.println(account.getDetails());
							found=true;
						}
					}
				 if(!true) {
					 throw new accountNotaccount("account with :"+findacc+"not found");
				 }
			 }catch(accountNotaccount e) {
				 System.out.println("error "+e.getMessage());
			 }
			 break;
			 
			
		case 3:
			System.out.println("enter account no.:");
			for(Account account : acc) {
				
					System.out.println(account.getDetails());
				
			}
			
		case 5:
			System.out.println("enter amount to withdraw.:");
			double withdraw = sc.nextDouble();
			System.out.println("enter account no.:");
			 findacc = sc.nextInt();
			 for(Account account : acc) {
					if(account.accountNumber==findacc) {
						System.out.println(account.withdraw(withdraw));
					}
				}
			 
		case 6:
			System.out.println("enter amount to withdraw.:");
			double deposite = sc.nextDouble();
			System.out.println("enter account no.:");
			 findacc = sc.nextInt();
			 for(Account account : acc) {
					if(account.accountNumber==findacc) {
						System.out.println(account.deposite(deposite));
					}
				}
			 
		case 8:
			System.out.println("enter name to find an account.:");
			sc.nextLine();
			String Name = sc.nextLine();
			System.out.println("enter name .:");
			 findacc = sc.nextInt();
			 for(Account account : acc) {
					if(account.name==Name) {
						System.out.println(account.getDetails());
					}
				}
			 
		case 9:
			System.out.println("enter name to find an account.:");
			sc.nextLine();
			email = sc.nextLine();
			System.out.println("enter email .:");
			 findacc = sc.nextInt();
			 for(Account account : acc) {
					if(account.email==email) {
						System.out.println(account.getDetails());
					}
				}
			 
		case 10:
			System.out.println("enter name to find an account.:");
			sc.nextLine();
			 phone = sc.nextInt();
			System.out.println("enter phone .:");
			 findacc = sc.nextInt();
			 for(Account account : acc) {
					if(account.phone==phone) {
						System.out.println(account.getDetails());
					}
				}
			 
		case 11:
			System.out.println("enter 0:");
		
		}
		}while(ch!=0);
	}
}