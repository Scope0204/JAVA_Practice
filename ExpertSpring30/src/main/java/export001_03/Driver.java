package export001_03;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire = new KoreaTire();
		//Tire tire = new AmericaTire();
		
		Car car = new Car();
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());

	}

}
