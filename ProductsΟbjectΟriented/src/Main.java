import java.util.Scanner; //για να μπορώ να φτιάξω το αντικέιμενο


public class Main {
	
	public static void main(String[ ] args) {
		Scanner in = new Scanner(System. in);
		//κλήση του κατασκευαστή στις κλάσης
	    Product best = new Product();
		
		boolean more = true; 
		while(more) {
			
			Product current = new Product();
			
			//κλήση της μεθόδου read επί του αντικειμένου current
			current.read();
			
			if (current.is_better_than(best))
				best = current;
			
			System.out.println("More Products? 1:YES, 2:NO");
			int answer = in.nextInt();
			if(answer != 1)
				more = false; 
			in.nextLine();
		}
		System.out.println("Best Product: ");
			best.printData();
		  }
			
		
			
		}
	
	

