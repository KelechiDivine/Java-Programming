package chapterSeven.examples;

public class Args {
	
	public static void main(String[] args){
		if (args.length != 3)
			System.out.printf("Error: Please re-enter the entire command, including%n" +
					"an array size, initial value and increment.%n");
		
		else {
			
			int arrayLength = Integer.parseInt(args[0]);
			int [] arraysArray = new int[arrayLength];
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			for (int counter = 0; counter < arraysArray.length; counter = counter + 1)
				System.out.printf("%5d%8d%n", counter, arraysArray[counter]);
			
			System.out.println(initialValue);
			System.out.println(increment);
		}
	}
}
