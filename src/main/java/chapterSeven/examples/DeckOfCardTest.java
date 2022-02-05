package chapterSeven.examples;

public class DeckOfCardTest {

	public static void main(String[] args){

		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();

		for(int index = 1; index <= 52; index++){
			System.out.printf("%-19s", myDeckOfCards.dealCard());

			if (index % 4 == 0)
				System.out.println();
		}
	}
}
