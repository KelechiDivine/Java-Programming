package SMS;

import SMS.model.StudentModel;
import SMS.model.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements StudentService {
	
	@Override
	public void registerStudent(StudentModel newStudent) {
		if (studentDatabase.isEmpty()){
			studentDatabase.add(newStudent);
		}
	}
	
	@Override
	public String findStudentByEmail(String studentEmail) throws StudentException {
		return null;
	}
	
	@Override
	public int findById(int studentId) throws StudentException {
		return 0;
	}
	
	@Override
	public void updateStudent(StudentModel studentModel) {
	
	}
	
	@Override
	public void save(StudentModel studentModel) {
	
	}
	
	@Override
	public void deleteById(int id) {
	
	}
	
	@Override
	public void deleteByEmail(String email) {
	
	}
	
	@Override
	public void deleteByPhoneNumber(String phoneNumber) {
	
	}
}
