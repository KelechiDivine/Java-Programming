package unitTesting;

import java.util.ArrayList;

public class Turing {
	
	public void calPoints(){
		System.out.println("Turing test is not null;");
	}

	public  int calPoints(String[] ops){
	
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (String a : ops) {
			if (a.equals("C")) {
				arrayList.remove(arrayList.size() - 1);
			} else {
				if (a.equals("D")) {
					arrayList.add((arrayList.get(arrayList.size() - 1)) * 2);
				} else {
					if (a.equals("+")) {
						arrayList.add((arrayList.get(arrayList.size() - 1)) + arrayList.get(arrayList.size() - 2));
					} else {

						arrayList.add(Integer.parseInt(a));
					}
				}
			}
		}
		int total = 0;
		for(int number : arrayList){
			total += number;
		}
		System.out.println("The total " + total);
		return total;
	}
}
