package ex003;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// 종합쇼핑몰에 대한 정보 
		ApplicationContext context = new ClassPathXmlApplicationContext("ex003/ex003.xml");
		
		Car car = context.getBean("car", Car.class);
		
		// 속성을 사용하며 쓸모 없어진 코드 
		/*
		Tire tire = context.getBean("tire", Tire.class);
		car.setTire(tire);
		*/
		
		System.out.println(car.getTireBrand());

	}

}
