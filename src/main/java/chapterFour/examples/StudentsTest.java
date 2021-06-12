package chapterFour.examples;

public class StudentsTest {
	
	
	public static void main(String[] args){
		
	Students students = new Students("Jane Green", 93.5);
	Students secondStudents = new Students("John Blue", 72.75);
	
	System.out.printf("%s's letter grade is: %s%n",students.getName()
	, students.getLetterGrade());
		
		System.out.printf("%s's letter grade is: %s%n", secondStudents.getName()
				, secondStudents.getLetterGrade());
	}
}
