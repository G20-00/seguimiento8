package model;


import static org.junit.jupiter.api.Assertions.*;
import exceptions.DayIncorrect;
import exceptions.IdException;
import org.junit.jupiter.api.Test;

class MiniMarketTest {
	private MiniMarket minimarket;
	public void setupScenary1() {
		minimarket = new MiniMarket();
	}
	
	@Test
	void testMiniMarket() {
		setupScenary1();
		
		try {			
			 minimarket.creatPerson("CC","16691344");			
		
		} catch (IdException nope) {
			fail("Not IdException expected");
		}catch(DayIncorrect nope) {
			fail("Not DayIncorrect expected");
		}
	}
	@Test
	void testMiniMarket2() {
		setupScenary1();
		
		try {			
			 minimarket.creatPerson("TI","12312124");			
		} catch (IdException nope) {
			fail("Not IdException expected");
		}catch(DayIncorrect nope) {
			fail("Not DayIncorrect expected");
		}
	}
	@Test
	void testMiniMarket3() {
		setupScenary1();
		
		try {			
			 minimarket.creatPerson("CC","12312133");			
		
		} catch (IdException nope) {
			fail("Not IdException expected");
		}catch(DayIncorrect nope) {
			fail("Not DayIncorrect expected");
		}
	}


}
