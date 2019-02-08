package evenfibonaccinumbers;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		
		int upperBound = 4000000;
		
		int total = 2;
		
		List<Integer> fibonacci = new ArrayList<Integer>();
		
		fibonacci.add(1);
		fibonacci.add(2);
		
		int next;
		while(fibonacci.get(fibonacci.size() - 1) < upperBound) {
			next = fibonacci.get(fibonacci.size() - 2) + fibonacci.get(fibonacci.size() - 1);
			fibonacci.add(next);
			if(next % 2 == 0) 
				total += next;
		}
		
		System.out.println("The total of even fibonacci numbers below " + upperBound + " is " + total);
	}

}
