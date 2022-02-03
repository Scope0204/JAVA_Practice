package ex002;

import static org.junit.Assert.*;

import org.junit.Test;


public class CarTest {

	@Test
	public void korea_tire() {
		Tire tire1 = new KoreaTire();
		Car car1 = new Car();
		car1.setTire(tire1);
		
		assertEquals("장착된 타이어: Korea Tire", car1.getTireBrand());
	}
	
	@Test
	public void america_tire() {
		Tire tire2 = new AmericaTire();
		Car car2 = new Car();
		car2.setTire(tire2);
		
		assertEquals("장착된 타이어: America Tire", car2.getTireBrand());
	}

}
