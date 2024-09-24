import java.util.Scanner;

public class Product {
	// οι ιδιότητες του αντικειμένου δεν είναι ορατές στον έξω κόσμο λογω του private
	private String name; 
	private int score;
	private double price;
	
	//ο κατασκευαστής πρέπει να έχει το όνομα της κλάσης
	public Product() {
	    
		name = "";
		price = 1;
		score = 0;
	}
	
	public void printData(){
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Score: " + score);
			
	}
	public void read() {
		//φτιάχνω το αντικείμενο για να αλληλεπιδρώ με την κονσόλα
		Scanner in = new Scanner(System. in);
			//διαβάζω τις τιμές
			System.out.println("Product name: ");
			name = in.nextLine();
			System.out.println("Product Price: ");
			price = in.nextDouble();
			System.out.println("Product Sore: ");
			score = in.nextInt();
			
		}
	
	
	public boolean is_better_than(Product other) {
		
		if(score/price > other.score/other.price) 
			return true;
			else
				return false;
		
		
	
	}
}
