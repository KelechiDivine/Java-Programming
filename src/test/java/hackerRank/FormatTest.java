package hackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FormatTest {
	
	private Format format;
	
	@BeforeEach
	public void setFormat(){
		format = new Format();
	}
	
	@Test
	public void test_format(){
		String x = format.arrangeWord("What the fuck?");
		Assertions.assertEquals("What the fuck?", x, "There was nothing to do here.");
	}
}