package SMS.model;

import SMS.StudentRepository;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentModelTest {
	
	private StudentModel studentModel;
	private StudentServiceImplementation studentServiceImplementation;
	private StudentRepository studentRepository;
	
	@BeforeEach
	public void setStudentRepository(){
		studentModel = new StudentModel();
		studentServiceImplementation = new StudentServiceImplementation();
		studentRepository = new StudentRepository();
}