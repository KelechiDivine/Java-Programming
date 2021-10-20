package SMS.model;

import SMS.StudentException;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
	
	StudentModel st = new StudentModel();
	
	List<StudentModel> studentDatabase = new ArrayList<>();
	
	default void registerStudent(StudentModel newStudent){}
	
	
	default String findStudentByEmail(String studentEmail) throws StudentException {
		if (studentDatabase.contains(studentEmail)) {
			st.getEmail();
		} else {
			throw new StudentException();
		}
		return st.getEmail();
	}
	
	default int findById(int studentId) throws StudentException {
		if (studentDatabase.contains(studentId)){
			st.getId();
		}
		else {
			throw new StudentException();
		}
		return st.getId();
	}
	
	default void updateStudent(StudentModel studentModel){
		studentModel.setId(studentModel.getId());
		studentModel.setFirstName(studentModel.getFirstName());
		studentModel.setLastName(studentModel.getLastName());
		studentModel.setAddress(studentModel.getAddress());
		save(studentModel);
	}
	
	 void save(StudentModel studentModel);
	
	default void deleteById(int id){
		studentDatabase.remove(id);
	}
	
	default void deleteByEmail(String email) {
		studentDatabase.remove(email);
	}
	
	default void deleteByPhoneNumber(String phoneNumber){
		studentDatabase.remove(phoneNumber);
	}
}
