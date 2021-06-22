package unitTesting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreatingArrayListFromCollectionExamples {
	
	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		
		List<Integer> list2= new ArrayList<>();
		
		list2.add(3);
		list2.add(6);
		list2.add(9);
		list2.add(12);
		list2.add(15);
		
		
		Set<Integer> set = new HashSet<>(list2);
		Set<Integer> set2 = new HashSet<>(list);
		
		System.out.print(set);
		System.out.print(set2);
	}
}
