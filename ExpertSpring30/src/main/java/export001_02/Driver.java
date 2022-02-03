package export001_02;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire = new KoreaTire();
		//Tire tire = new AmericaTire();
		
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());

	}

}
