package assign3q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LibHash {

public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
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
