package chapterEleven.example;

public class UsingExceptions {
	
	public static void main(String[] args) {
		
		try {
			throwException();
		}
		catch (Exception exception){
			System.err.println("Exception handled in main");
		}
		
		doesNotThrowException();
	}
	
	private static void doesNotThrowException() {
	}
	
	private static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		
		catch (Exception exception){
			System.err.println(
					"Exception handled in method throwException"
			);
			throw exception;
		}
	
	}
}
