package model;


import static org.junit.jupiter.api.Assertions.*;
import exceptions.DayIncorrect;
import exceptions.IdException;
import org.junit.jupiter.api.Test;

class MiniMarketTest {
	private MiniMarket minimarket;
	private String id;
	private String typeId;
	public void setupScenary1() {
		minimarket = new MiniMarket();
		id = "16691344";
		typeId ="CC";
	}
	public void setupScenary3() {
		minimarket = new MiniMarket();
		id = "12312133";
		typeId ="CC";
	}
	public void setupScenary2() {
		minimarket = new MiniMarket();
		id = "12312124";
		typeId ="TI";
	}
	
	
	@Test
	void testMiniMarket() {
		setupScenary1();
		
		try {			
			 minimarket.creatPerson(typeId,id);			
		
		} catch (IdException nope) {
			fail("Not IdException expected");
		}catch(DayIncorrect nope) {
		}
	}
	@Test
	void testMiniMarket2() {
		setupScenary2();
		
		try {			
			 minimarket.creatPerson(typeId,id);			
		} catch (IdException nope) {
			
		}catch(DayIncorrect e) {
			fail("Not DayIncorrect expected");
		}
	}
	@Test
	void testMiniMarket3() {
		setupScenary3();
		
		try {			
			 minimarket.creatPerson(typeId,id);			
		
		} catch (IdException nope) {
			fail("Not IdException expected");
		}catch(DayIncorrect e) {
			
		}
	}


}
