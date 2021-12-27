package Microsoft;

import java.util.Arrays;

public class Solutions {
	
	public int solution(int[] A){

		int maxSize = 100000;
		int[] counter  = new int[maxSize];
		
		for(int number : A){
			if (number > 0 && number <= maxSize){
				counter[number - 1] = 1;
			}
		}
		
		for (int i = 0; i < maxSize; i++){
			if (counter[i] == 0)
				return i + 1;
		}
		System.out.println(Arrays.toString(counter));
		return maxSize;
	}
}
