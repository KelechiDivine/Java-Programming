package chapterFive.examples;

public class ContinueTest {
	
	public static void main(String[] args){
	
		for (int count = 1; count <= 10; count = count + 1){
			
			if (count == 5)
				continue;
			
			System.out.printf("% d", count);
		}
		
		System.out.printf("%nUsed continue to skip printing 5%n");
		
	}
}
