package chapterSix.exercises;

public class DisplayAnyCharacter {
	
	char characterVariable;
	
	public void charArgument(int length, char filledCharacter){
		for (int args = 1; args <= length; args++){
			for (int secondArgs = 1; secondArgs <= length; secondArgs++)
				System.out.print(filledCharacter);
			characterVariable = filledCharacter;
			System.out.println();
		}
	}
	public char returnChar(){
		return characterVariable;
	}
}
