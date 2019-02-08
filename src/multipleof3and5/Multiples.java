package multipleof3and5;

public class Multiples {

	public static void main(String[] args) {
		
		int upperBound = 1000;
		
		int total = 0;
		
		int counter;
		for(counter = 0; counter < upperBound; counter++) {
			if(counter % 3 == 0 || counter % 5 == 0) {
				total += counter;
			}
		}
		
		System.out.println("The total of multiples of 3 and 5 below " + upperBound + " is " + total);
		
	}

}
