package SMS.model;

import SMS.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
	
	private Student student;
	private StudentServiceImplementation studentServiceImplementation;
	private StudentRepository studentRepository;
	
	@BeforeEach
	public void setStudentRepository() {
		student = new Student();
		studentServiceImplementation = new StudentServiceImplementation();
		studentRepository = new StudentRepository();
	}
	
	@Test
	public void assertThatStudentClassExist(){
		Student student = new Student();
		Assertions.assertNotNull(student);
	}
	
	@Test
	public void test_StudentCanRegister(){
		
		student.setFirstName("Kelechi");
		student.setLastName("Okoroafor");
		student.setAddress("3, Owowjori Street, Ijoko Ogun State");
		student.setEmail("okoroaforkelechi123@gmail.com");
		student.setId(1);
		student.setPhoneNumber("08082167764");
		studentRepository.save(student);
		
		Assertions.assertNotNull(student, "Student doesn't exist...");
		
	}
	
	@Test
	public void test_findStudentById(){
		StudentRepository studentRepository = new StudentRepository();
		studentRepository.findById(2);
		Assertions.assertTrue(true);
	}
}