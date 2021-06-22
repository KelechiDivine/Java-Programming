package unitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumClassTest {
	
	@BeforeEach
	void setUp() {
	}
	
	@Test
	public void simpleEnumExampleOutsideClassTest(){
	
		EnumClass.Days days = EnumClass.Days.Sunday;
		System.out.print("Days enum inside the class is set a value: " + days);
		assertEquals(EnumClass.Days.valueOf("Sunday"), days);
		
	}
}