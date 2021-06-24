package unitTesting;

import java.util.*;

public class RemoveAll {
	
	public static void main(String... args){
		
		Set<Integer> numbers = new LinkedHashSet<>();
		
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		
		List<Integer> perfectSquares = new ArrayList<>();
		
		perfectSquares.add(4);
		perfectSquares.add(9);
		
		perfectSquares.forEach(numbers::remove);
		
		System.out.print("After removing all perfect square: " + numbers);
		
	}
}
