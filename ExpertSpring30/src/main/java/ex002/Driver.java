package ex002;

//2개의 import문 추가 : 종합쇼핑몰(스프링 프레임워크)에 대한 정보를 가지고 있는 패키지 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// 종합쇼핑몰에 대한 정보 
		ApplicationContext context = new ClassPathXmlApplicationContext("ex002/ex002.xml");
		
		// 종합쇼핑몰에서 car와 tire 구매  
		Car car = context.getBean("car", Car.class);
		Tire tire = context.getBean("tire", Tire.class);
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());

	}

}
