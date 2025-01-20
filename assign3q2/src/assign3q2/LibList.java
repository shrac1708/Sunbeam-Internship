package assign3q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Library{
	public int isbn;
	public double price;
	public int publishDate;
	public String authorName;
	public int quantity;
	
	public String Category;
	
	Library(int isbn , double price , int publishDate, String authorName, String Category ,int quantity){
		this.isbn=isbn;
		this.price=price;
		this.authorName=authorName;
		this.Category=Category;
		this.quantity=quantity;
	}
	
	public String Details() {
		return toString();
	}
	public String toString() {
		return " isbn: "+isbn +"price: "+price +  "publishDate: " +publishDate + " authorName: "+authorName+"Category: " +Category + " quantity: "+quantity;
	}
	
	public int getquantity() {
		return quantity;
	}
	public int getisbn() {
		return isbn;
	}
	public String getauthorName() {
		return authorName;
	}
	public void validate(String Category) {
		
	}
	
	
}


public class LibList {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		ArrayList<Library>bo = new ArrayList();
		HashSet<Library>ha  = new HashSet();
		
		int isbn;
		int price;
		int publishDate;
		String authorName;
		String Category;
		
		int quantity;
		int counter;
		int ch;
		int parti;
		int qty = 0;
		do {
			
		
		System.out.println("menu");
		System.out.println("1.Input detail");
		System.out.println("2.display all");
		System.out.println("3.Find particular");
		System.out.println("5.Edit particular");
		System.out.println("6.edit book details");
		System.out.println("7.sort book");
		
		 ch = sc.nextInt();
		

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
			System.out.println("enter category: ");
			Category=sc.nextLine();
			System.out.println("enter quantity: ");
			quantity = sc.nextInt();
			bo.add( new Library(isbn,price,publishDate,authorName,Category,quantity));
			break;

		case 2:
			System.out.println("display all: ");
			for(Library boo :bo) {
				System.out.println(boo.Details());
			}
			break;
			
		case 3:
			System.out.println("display particular: ");
			System.out.println("enter the isbn: ");
			 parti = sc.nextInt();
			for(Library boo :bo) {
				if(boo.isbn==parti)
				System.out.println(boo.Details());
			}
			break;
			
		case 5:
			System.out.println("edit particular: ");
			System.out.println("enter the isbn: ");
			 parti = sc.nextInt();
			for(Library boo :bo) {
				if(boo.isbn==parti)
				 qty = sc.nextInt();
				  boo.quantity = qty;
				System.out.println(boo.getquantity());
				}
			break;
			
		case 6:
			System.out.println("sort: ");
	        bo.sort(Comparator.comparingInt(Library::getisbn).thenComparing(Library::getauthorName));
	        break;
	        
		case 7:
			System.out.println("valid category: ");
			 Category=sc.nextLine();
	        validate(Category);
	        break;
		}
		}while(ch!=0);
		
		//////using hashset
		
		do {
			
			
			System.out.println("menu");
			System.out.println("8.Input detail");
			System.out.println("9.display all");
			System.out.println("10.Find particular");
			System.out.println("11.Edit particular");
			System.out.println("12.edit book details");
			System.out.println("13.sort book");
		
		 ch = sc.nextInt();
		

		switch(ch) {
		case 8: 
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
			System.out.println("enter category: ");
			Category=sc.nextLine();
			System.out.println("enter quantity: ");
			quantity = sc.nextInt();
			ha.add( new Library(isbn,price,publishDate,authorName,Category,quantity));
			break;

		case 9:
			System.out.println("display all: ");
			for(Library hash :ha) {
				System.out.println(hash.Details());
			}
			break;
			
		case 10:
			System.out.println("display particular: ");
			System.out.println("enter the isbn: ");
			 parti = sc.nextInt();
			for(Library hash :ha) {
				if(hash.isbn==parti)
				System.out.println(hash.Details());
			}
			break;
			
		case 11:
			System.out.println("edit particular: ");
			System.out.println("enter the isbn: ");
			 parti = sc.nextInt();
			for(Library hash :ha) {
				if(hash.isbn==parti)
				 qty = sc.nextInt();
				  hash.quantity = qty;
				System.out.println(hash.getquantity());
				}
			break;
			
		case 12:
			System.out.println("edit particular: ");
	        ((List<Library>) ha).sort(Comparator.comparingInt(Library::getisbn).thenComparing(Library::getauthorName));
	        break;
	        
		case 13:
			System.out.println("valid category: ");
			 Category=sc.nextLine();
	        validate(Category);
	        break;
		}
		}while(ch!=0);
		
		
	}

	public static void validate(String Category) {
		// TODO Auto-generated method stub
		Category = Category.toLowerCase();
		String[] categories = {"science" , "fiction", "health" ,"History", "Mystery", "Biography"} ;
		for(String cate : categories ) {
			if(Category==cate) {
				System.out.println("true");
			}
		}
		System.out.println("false");
	}

}
