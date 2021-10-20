package SMS.model;

import SMS.StudentRepository;

import java.util.List;

public class StudentServiceImplementation implements StudentService{
	
	private StudentRepository studentRepository;
	
	@Override
	public void registerStudent(StudentModel newStudent) {
		studentRepository.save(newStudent);
	}
	
	@Override
	public StudentModel findStudentByEmail(String studentEmail){
		return null;
	}
	
	@Override
	public StudentModel findById(int studentId) {
		return studentRepository.findById(studentId);
	}
	
	@Override
	public StudentModel updateStudent(StudentModel studentModel) {
		return null;
	}
	
	@Override
	public void save(StudentModel studentModel) {
	
	}
	
	@Override
	public List<StudentModel> findAll() {
		return null;
	}
	
	@Override
	public void deleteById(int id) {
	
	}
	
	@Override
	public void deleteByPhoneNumber(String phoneNumber) {
		StudentService.super.deleteByPhoneNumber(phoneNumber);
	}

//	private StudentRepository studentRepository;
//
//	@Override
//	public void registerStudent(StudentModel newStudent) {
//		if (studentDatabase.isEmpty()){
//			studentDatabase.add(newStudent);
//		}
//	}
//
//	@Override
//	public String findStudentByEmail(String studentEmail) throws StudentException {
//		if (studentDatabase.contains(studentEmail)) {
//			st.getEmail();
//		} else {
//			throw new StudentException();
//		}
//		return st.getEmail();
//	}
//
//	@Override
//	public int findById(int studentId) throws StudentException {
//		if (studentDatabase.contains(studentId)){
//			st.getId();
//		}
//		else {
//			throw new StudentException();
//		}
//		return st.getId();
//	}
//
//	@Override
//	public void updateStudent(StudentModel studentModel) {
//		studentModel.setId(studentModel.getId());
//		studentModel.setFirstName(studentModel.getFirstName());
//		studentModel.setLastName(studentModel.getLastName());
//		studentModel.setAddress(studentModel.getAddress());
//		save(studentModel);
//	}
//
//	@Override
//	public void save(StudentModel studentModel) {}
//
//	@Override
//	public void deleteById(int id) {
//		studentDatabase.remove(id);
//	}
//
//	@Override
//	public void deleteByEmail(String email) {
//		studentDatabase.remove(email);
//	}
//
//	@Override
//	public void deleteByPhoneNumber(String phoneNumber) {
//		studentDatabase.remove(phoneNumber);
//	}
}
