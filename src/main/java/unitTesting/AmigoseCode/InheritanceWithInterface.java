package unitTesting.AmigoseCode;

public interface InheritanceWithInterface {
	
	default void delete(String name){}
	
	default void add(String name){
		if (name.equals("")){
			System.out.println("Good job man.");
		}
	}
	
	default void let(String name){}
	
	default void create(String name){}
	
	default void findById(String name){}
	
	default void copy(){}
}
