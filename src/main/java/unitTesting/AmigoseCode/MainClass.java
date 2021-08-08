package unitTesting.AmigoseCode;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
//		String name = new String("KelechiDivine");
//
//		System.out.print(name.toUpperCase());
//		System.out.println(name.toLowerCase());
//		System.out.println(name.charAt(1));
//
		List<Integer> l1
				= new ArrayList<Integer>();
		
		// Adds 1 at 0 index
		l1.add(0, 1);
		
		// Adds 2 at 1 index
		l1.add(1, 2);
		System.out.println(l1);
	}
	
}
