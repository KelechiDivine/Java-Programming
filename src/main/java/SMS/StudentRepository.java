package SMS;

import SMS.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository{
	
	List<StudentModel> database = new ArrayList<>();
	
	public void save(StudentModel newStudent) {
		database.add(newStudent);
	}
	
	public StudentModel findById(int id) {
		for (int i= 1; i <= database.size(); i++){
			database.get(id);
		}
		return null;
	}
	
	public StudentModel deleteById(int id){
		StudentModel studentModel = findById(id);
		database.remove(studentModel);
		return null;
	}
	
	public StudentModel findAll(){
		for (int i= 1; i <= database.size(); i++){
			database.listIterator();
		}
			return null;
		}
	
	public StudentModel deleteAll(){
		StudentModel model = findAll();
		database.remove(model);
		return null;
	}
	
	public StudentModel updateStudent(StudentModel studentModel){
		studentModel.setPhoneNumber(studentModel.getPhoneNumber());
		studentModel.setEmail(studentModel.getEmail());
		studentModel.setFirstName(studentModel.getFirstName());
		studentModel.setLastName(studentModel.getLastName());
		studentModel.setAddress(studentModel.getAddress());
		studentModel.setId(studentModel.getId());
		save(studentModel);
		
		return studentModel;
	}
}
