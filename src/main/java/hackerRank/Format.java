package hackerRank;

public class Format {

//		for(int format = 0; format < 3; format = format + 1){
//
//			String firsString = sc.next();
//
//			int wordArrangement = sc.nextInt();
//
//			System.out.printf("%-14s %03d\n", firsString, wordArrangement);
//		}
//
//		System.out.println("================================");
//	}
	
	public String arrangeWord(String word){
		for (int format = 0; format < 3; format ++){
			System.out.println("%-14s %03d\n");
		}
		return word;
	}
}
