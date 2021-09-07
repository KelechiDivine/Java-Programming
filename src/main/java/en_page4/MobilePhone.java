package en_page4;

import java.util.*;

public class MobilePhone {
	
	
	public void search(){
		System.out.print("1: Search");
	}
	
	public void service_number(){
		System.out.print("2 Service Number");
	}
	
	public void add_name(){
		System.out.print("3: Add name");
	}
	
	public void erase() {
		System.out.print("4: Erase");
	}
	
	public void edit() {
		System.out.print("5: Edit");
	}
	
	public void assign_tone() {
		System.out.print("6: Assign tone");
	}
	
	public void send_b_card() {
		System.out.print("7: Send b's card");
	}
	
	public void option() {
		System.out.print("8: Options");
		System.out.print(navigate_options(8));
	}
	
	public boolean navigate_options(int is_navigate) {
		if (is_navigate == 8) {
			System.out.print("\t-> Type Of view");
			System.out.print("\t-> Memory status");
		}
		return false;
	}
	
	public void speed_dials() {
		System.out.print("9: Speed Dials");
	}
	
	public void voice_tags() {
		System.out.print("10: Voice Tags");
	}
	
	
	public void addName_toDatabase(String name){
		Set<String> stringListOfName = new HashSet<String>();
		stringListOfName.add(name);
		System.out.println(name + " have been added to the database.");
	}
	
	
	public void searchName_inDatabase(String searchName) {
		Optional<String> nameIsPresent = Optional.of("");
		addName_toDatabase(searchName);
	}
}
