package workingWithAyomide;

public enum Book {
	
	JHTP("Java how to program", "2015"),
	CHTP("C hoe to program", "2013"),
	IW3HTP("Internet & World Wide Web How to program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual c# How to Program", "2014");
	
	
	private final String title;
	private final String copyrightYear;
	
	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getCopyrightYear(){
		return copyrightYear;
	}
}
