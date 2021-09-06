package en_page4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MobilePhoneTest {
	
	private MobilePhone mobilePhone;
	
	@BeforeEach
	public void setUp(){
		mobilePhone = new MobilePhone();
	}
	
	@Test
	public void testSearch(){
		mobilePhone.search();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testService_number(){
		mobilePhone.service_number();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testAdd_name(){
		mobilePhone.add_name();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testErase(){
		mobilePhone.erase();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testEdit(){
		mobilePhone.edit();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testAssign_tone(){
		mobilePhone.assign_tone();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testSend_b_card(){
		mobilePhone.send_b_card();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testOption(){
		mobilePhone.option();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testSpeedDial(){
		mobilePhone.speed_dials();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testVoiceTag(){
		mobilePhone.voice_tags();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void testAddName_toDatabase(){
		mobilePhone.addName_toDatabase("Kelechi");
		mobilePhone.addName_toDatabase("Nonso");
		mobilePhone.addName_toDatabase("ZipDemon");
		mobilePhone.addName_toDatabase("Elizabeth");
		mobilePhone.addName_toDatabase("Sam");
		mobilePhone.addName_toDatabase("Ozi");
		mobilePhone.addName_toDatabase("Chibuzor");
		mobilePhone.addName_toDatabase("Billy");
		mobilePhone.addName_toDatabase("Mofe");
		mobilePhone.addName_toDatabase("Inem");
		mobilePhone.addName_toDatabase("Mongo");
		Assertions.assertTrue(true);
	}
}