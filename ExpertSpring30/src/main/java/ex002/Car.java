package ex002;

public class Car {
	Tire tire; 
	
	//생성자 x . 기본 생성자 
	
	// tire 속성에 대한 접근자 및 설정자 메서드 생성 
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}
}
