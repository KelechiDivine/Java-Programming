package SMS.model;

import java.util.List;


public interface StudentService {

	default void registerStudent(StudentModel newStudent){}
	
	StudentModel findStudentByEmail(String studentEmail);
	
	StudentModel findById(int studentId);
	
	StudentModel updateStudent(StudentModel studentModel);
	
	void save(StudentModel studentModel);
	
	List<StudentModel> findAll();
	
	void deleteById(int id);
	
	default void deleteByPhoneNumber(String phoneNumber){}
}
