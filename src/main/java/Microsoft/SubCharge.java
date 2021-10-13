package Microsoft;

public class SubCharge {
	
	public int addWithSubCharge(int firstNum, int secondNum){
		int sum;
		sum = firstNum + secondNum;
		
		if (firstNum + secondNum > 10)
			sum = 2;
			System.out.printf("%nSubCharge is %d", sum);
		
		if (firstNum + secondNum <= 10)
			sum = 1;
			System.out.printf("SubCharge is %d", sum);

		return sum;
	}
}
