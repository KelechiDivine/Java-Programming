package SMS.model;

import SMS.StudentRepository;

import java.util.List;

public class StudentServiceImplementation implements StudentService{
	
	private StudentRepository studentRepository;
	
	@Override
	public void registerStudent(Student newStudent) {
		studentRepository.save(newStudent);
	}
	
	@Override
	public Student findStudentByEmail(String studentEmail){
		return null;
	}
	
	@Override
	public Student findById(int studentId) {
		return studentRepository.findById(studentId);
	}
	
	@Override
	public Student updateStudent(Student student) {
		studentRepository.updateStudent(student);
		return null;
	}
	
	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}
	
	@Override
	public List<Student> findAll() {
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
