package chapterSeven.examples.classArrays;

import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String [] args){
		
		ArrayList<String> items = new ArrayList<String>();
		items.add(" red ");
		items.add(0, " yellow ");
		
		System.out.println("Display list content with counter-controller loop: ");
		
//		for (int index = 0; index < items.size(); index = index + 1)
//			System.out.printf("%s", items.get(index));
		
		for (String item : items)
			System.out.printf("%s ", item);
		
		display(items, " Display list contents with enhanced for statement: ");
		
		items.add(" green ");
		items.add(" yellow ");
		display(items, "List with two new elements: ");
		
		
		items.remove(" yellow ");
		display(items, "remove first instance of yellow:");
		
		items.remove(1);
		display(items, "Removed second instance of element (green): " );
		System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "":"not ");
		
		System.out.printf("Size: %s%n", items.size());
	}
	
	public static void display(ArrayList<String> items, String header) {
		System.out.print(header);
		
		for (String item : items)
			System.out.printf("%s", item);
		
		System.out.println();
	
	}
}
