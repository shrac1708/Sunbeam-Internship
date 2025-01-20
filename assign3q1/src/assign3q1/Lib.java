package assign3q1;

import java.util.Scanner;
class Book{
	public int isbn;
	public double price;
	public int publishDate;
	public String authorName;
	public int quantity;
	private Object Book;
	
	Book(int isbn , double price , int publishDate, String authorName,int quantity){
		this.isbn=isbn;
		this.price=price;
		this.authorName=authorName;
		this.quantity=quantity;
	}
	
	public String Details() {
		return toString();
	}
	public String toString() {
		return " isbn: "+isbn +"price: "+price +  "publishDate: " +publishDate + " authorName: "+authorName+" quantity: "+quantity;
	}
	
	public int getquantity() {
		return quantity;
	}
	
	
	
}

public class Lib {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter the length");
		int len = sc.nextInt();
		
		Book[] book = new Book[len];
		
		int isbn;
		int price;
		int publishDate;
		String authorName;
		
		int quantity;
		int counter;
		int ch;
		int parti;
		int qty = 0;
		
		do {
			
		
		System.out.println("menu");
		System.out.println("1.display all");
		System.out.println("2.Find particular");
		System.out.println("3.Add new book");
		System.out.println("4.remove book");
		System.out.println("5.edit book details");
		
		 ch = sc.nextInt();
		counter=0;
		
		switch(ch) {
		case 1: 
			sc.nextLine();
			System.out.println("enter isbn: ");
			isbn = sc.nextInt();
			System.out.println("enter price: ");
			price = sc.nextInt();
			System.out.println("enter publishDate: ");
			publishDate = sc.nextInt();
			sc.nextLine();
			System.out.println("enter authorName: ");
			authorName=sc.nextLine();
			System.out.println("enter quantity: ");
			quantity = sc.nextInt();
			book[counter++] = new Book(isbn,price,publishDate,authorName,quantity);
			break;
	
		case 2:
			System.out.println("display all: ");
			for(Book bo :book) {
				System.out.println(bo.Details());
			}
			break;
			
		case 3:
			System.out.println("display particular: ");
			System.out.println("enter the isbn: ");
			 parti = sc.nextInt();
			for(Book bo :book) {
				if(bo.isbn==parti)
				System.out.println(bo.Details());
			}
			break;
		
		
			
		case 5:
			System.out.println("edit particular: ");
			System.out.println("enter the isbn: ");
			 parti = sc.nextInt();
			for(Book bo :book) {
				if(bo.isbn==parti)
				 qty = sc.nextInt();
				  bo.quantity = qty;
				System.out.println(bo.getquantity());
				}
			break;
		
		}
		}while(ch!=0);
	}

	
	}


