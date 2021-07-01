package chapterTwo.Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiameterCircumferenceAndAreaOfACircleTest {
	
	@Test
	public void thisTestClassHelpsFindTheDiameterOfACircleFromAUserInput(){
		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
		diameterCircumferenceAndAreaOfACircle.getDiameterOfCircleMethod(4);
		Assertions.assertEquals(8, diameterCircumferenceAndAreaOfACircle.getDiameterFromUserInput(), "The diameter of the circle was never found from user input");
	}
	
	@Test
	public void thisTestClassHelpsFindTheARadiusOfACircleFromAUserInput(){
		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
		diameterCircumferenceAndAreaOfACircle.getRadiusOfACircleMethod(6);
		Assertions.assertEquals(3, diameterCircumferenceAndAreaOfACircle.getRadiusFromAUser(), "The radius of the circle was never found from user input.");
	}
	
	@Test
	public void thisTestClassHelpsFindTheAreaOfACircleFromAUserInput(){
		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle = new DiameterCircumferenceAndAreaOfACircle();
		diameterCircumferenceAndAreaOfACircle.getAreaOfACircle(4);
		Assertions.assertEquals(50.26548245743669, diameterCircumferenceAndAreaOfACircle.getAreaFromUserInput(), "The area of the circle was never found fro the user input.");
	}
	
	@Test
	public void thisTestClassHelpsFindTheCircumferenceOfACircleFromAUserInput(){
		DiameterCircumferenceAndAreaOfACircle diameterCircumferenceAndAreaOfACircle =  new DiameterCircumferenceAndAreaOfACircle();
		diameterCircumferenceAndAreaOfACircle.getCircumferenceOfACircle(4);
		Assertions.assertEquals(25.132741228718345, diameterCircumferenceAndAreaOfACircle.getCircumference(), "There is no user circumference found!");
	}
}