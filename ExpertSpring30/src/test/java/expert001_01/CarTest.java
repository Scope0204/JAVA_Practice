package expert001_01;

import static org.junit.Assert.*;

import org.junit.Test;

import export001_01.Car;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car car = new Car();
		
		assertEquals("장착된 타이어: Korea Tire", car.getTireBrand());
		
	}

}
