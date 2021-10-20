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
		studentRepository.updateStudent(studentModel);
		return null;
	}
	
	@Override
	public void save(StudentModel studentModel) {
		studentRepository.save(studentModel);
	}
	
	@Override
	public List<StudentModel> findAll() {
		studentRepository.findAll();
		return null;
	}
	
	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}
	
	@Override
	public void deleteByPhoneNumber(String phoneNumber) {
		StudentService.super.deleteByPhoneNumber(phoneNumber);
	}
}
