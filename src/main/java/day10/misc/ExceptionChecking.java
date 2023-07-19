package day10.misc;

public class ExceptionChecking {

	public static void main(String[] args) {

		
		System.out.println(Divider.divisor(10, 1));
	}

}

class Divider{
	
	public static int divisor(int a , int b) throws IllegalArgumentException{
		
		if(b == 0) {
			
			throw new IllegalArgumentException("Divisor can't be empty");
			
		}
		
		else {
			
			int c = a /b;
			return c;
		}
	}
}
