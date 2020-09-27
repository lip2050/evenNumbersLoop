package evenNumbersLoop;

public class EvenNumbersDoWhileLoop {
	
	public static void main (String [] args) {
		
		int d = 1;
		do
		{
			if ( d % 2 == 0) {
		    	
				System.out.println(" This number is even "+ d);
				
			}
			
			d++;
			
		}while(d <= 20);
	}

}
