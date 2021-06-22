package unitTesting;

import java.util.HashSet;
import java.util.Set;

public class RemovingObjects {
	
	public static void main(String[] args){
		
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
	
		System.out.print("Numbers: " + numbers);
		
		boolean isRemoved = numbers.remove(10);
		
		System.out.printf("\nAfter remove%s -> {}", numbers);
		System.out.print("\nAfter remove (10) " + numbers);
		
	}
}
