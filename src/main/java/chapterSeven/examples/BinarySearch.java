package chapterSeven.examples;

public class BinarySearch {
	
	private long[]a;
	private int nElems;
	public BinarySearch(int max){
		a = new long[max];
		nElems = 0;
	}
	
	public int size(){
		return  nElems;
	}
	
	public int find(long searchKey){
		int lowerBound = 0;
//		int nElement = 0;
		int upperBound = nElems - 1;
		int curIn;
		
		while (true){
			curIn = 0;
			
			long [] a = new long[6];
			if (a[curIn] == searchKey){
				return curIn;
			}
			else {
				if (a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else
					upperBound = curIn - 1;
				System.out.println(upperBound);
			}
		}
	}
	
}
