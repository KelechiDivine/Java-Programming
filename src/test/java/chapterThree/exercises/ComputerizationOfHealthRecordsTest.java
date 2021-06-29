package chapterThree.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerizationOfHealthRecordsTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@Test
	public void testThatDateOfBirthCantBeObtained(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		computerizationOfHealthRecords.healthRecordMethodForDateOfBirth("16-12-2002");
		Assertions.assertEquals("16-12-2002", computerizationOfHealthRecords.getDateOfBirth(), "Date of birth not found.");
	}
	
	@Test
	public void testThatDateOfBirthCanBeSet(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		Assertions.assertEquals("23-1-2002", computerizationOfHealthRecords.setDateOfBirth("23-1-2002"), "Date of birth unable to update");
	}
	
	@Test
	public void testThatFirstNameCantBeNull(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		computerizationOfHealthRecords.healthRecordMethodForFirstName("Kelechi");
		Assertions.assertEquals("Kelechi", computerizationOfHealthRecords.getFirstName(), "First name doesn't match");
	}
	@Test
	public void testThatFirstNameCanBeSet(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		Assertions.assertEquals("Divine", computerizationOfHealthRecords.setFirstName("Divine"), "First name doesn't match");
	}
	
	@Test
	public void testThatLastNameIsNotNull(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		computerizationOfHealthRecords.healthRecordMethodForLastName("Okoroafor");
		Assertions.assertEquals("Okoroafor", computerizationOfHealthRecords.getLastName(), "Last name doesn't match");
	}
	@Test
	public void testThatLastNameCanBeSet(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		Assertions.assertEquals("Omolola", computerizationOfHealthRecords.setLastName("Omolola"), "Last name doesn't match");
	}
	
	@Test
	public void testThatWeightCanBeObtained(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		computerizationOfHealthRecords.heightRecordMethodForWeight(23.45);
		Assertions.assertEquals(23.45, computerizationOfHealthRecords.getWeight(), "Weight number not obtained.");
	}
	
	@Test
	public void testThatWeightCanBeSet(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		Assertions.assertEquals(2.45, computerizationOfHealthRecords.setWeight(2.45), "Weight number not set.");
	}
	
	@Test
	public void testThatHeightCanBeObtained(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		computerizationOfHealthRecords.healthRecordMethodForHeight(345.6);
		Assertions.assertEquals(345.6, computerizationOfHealthRecords.getHeight(), "Height not obtained.");
	}
	
	@Test
	public void testThatHeightCanBeset(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		Assertions.assertEquals(34, computerizationOfHealthRecords.setHeight(34), "Height not set.");
	}
	
//	@Test
//	public void testThatAgeCanBeObtained(){
//		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
//		computerizationOfHealthRecords.healthRecordMethodForAge(21);
//		Assertions.assertEquals(21, computerizationOfHealthRecords.getAge(), "Age was not obtained.");
//	}
//	@Test
//	public void testThatAgeCanBeSet(){
//		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
//		Assertions.assertEquals(23, computerizationOfHealthRecords.setAge(23), "Age was not set.");
//	}
	
	@Test
	public void testThatGenderNotNull(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		computerizationOfHealthRecords.healthRecordMethodForGender("male");
		Assertions.assertEquals("male", computerizationOfHealthRecords.getGender(), "Gender wasn't found.");
	}
	
	@Test
	public void testThatGenderSet(){
		ComputerizationOfHealthRecords computerizationOfHealthRecords = new ComputerizationOfHealthRecords();
		Assertions.assertEquals("female", computerizationOfHealthRecords.setGender("female"), "Gender wasn't found.");
	}
}




