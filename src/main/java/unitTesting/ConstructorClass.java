package unitTesting;

public class ConstructorClass {
	
	private String name;
	private double price;
	
	public ConstructorClass() {
	}
	
	public ConstructorClass(String name) {
		this.name = name;
	}
	
	public ConstructorClass(double price) {
		this.price = price;
	}
	
	public ConstructorClass(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
