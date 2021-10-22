package SMS;

import SMS.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository{
	
	List<Student> database = new ArrayList<>();
	
	public void save(Student newStudent) {
		database.add(newStudent);
	}
	
	public Student findById(int id) {
//		for (int i= 1; i <= database.size(); i++){
//			database.get(id);
//		}
		return null;
	
//		database.add()
	}
	
	public Student deleteById(int id){
		Student student = findById(id);
		database.remove(student);
		return null;
	}
	
	public Student findAll(){
		for (int i= 1; i <= database.size(); i++){
			database.listIterator();
		}
			return null;
		}
	
	public Student deleteAll(){
		Student model = findAll();
		database.remove(model);
		return null;
	}
	
	public Student updateStudent(Student student){
		student.setPhoneNumber(student.getPhoneNumber());
		student.setEmail(student.getEmail());
		student.setFirstName(student.getFirstName());
		student.setLastName(student.getLastName());
		student.setAddress(student.getAddress());
		student.setId(student.getId());
		save(student);
		
		return student;
	}
}
