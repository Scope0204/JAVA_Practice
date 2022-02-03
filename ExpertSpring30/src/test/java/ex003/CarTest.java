package ex003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("ex003.xml")
public class CarTest {

	@Autowired
	Car car; 
	
	@Test
	public void 한국타이어_장착_테스트() {
		assertEquals("장착된 타이어: Korea Tire", car.getTireBrand());
	}

}
