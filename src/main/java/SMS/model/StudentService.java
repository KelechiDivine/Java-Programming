package SMS.model;

import java.util.List;


public interface StudentService {

	default void registerStudent(Student newStudent){}
	
	Student findStudentByEmail(String studentEmail);
	
	Student findById(int studentId);
	
	Student updateStudent(Student student);
	
	void save(Student student);
	
	List<Student> findAll();
	
	void deleteById(int id);
	
	default void deleteByPhoneNumber(String phoneNumber){}
}
