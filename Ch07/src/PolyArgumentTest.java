class Product{
	int price; // 제품의 가격 
	int bonusPoint; //제품구매 시 제공하는 보너스점수
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
}

class Tv extends Product{
	Tv(){
		//조상클래스의 생성자 Product(int price)를 호출한다
		super(100); // Product(100); price는 100
	}
	public String toString() {
		//Object클래스 toString()을 오버라이
		return "Tv";
	}
}

class Computer extends Product{
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer { // 고객. 물건을 사는 사람  
	int money = 1000; // 보유금액 
	int bonusPoint = 0; // 보너스점수
	
	
	// 제품의 종류가 늘어날 때마다 새로운 buy메서드를 추가해주어야한다. 
	/*
	void buy(Tv t) { // tv를 구입하는 메서드 
		//Buyer가 가진 돈에서 제품의 가격만큼 뺀다. 
		money= money - t.price;
		
		//Buyer의 보너스점수에 제품의 보너스점수를 더한다.  
		bonusPoint = bonusPoint + t.bonusPoint;
	}
	
	void buy(Computer c) { // 컴퓨터 구입 메서드 
		money = money - c.price;
		bonusPoint = bonusPoint + c.bounsPoint;
	}
	void buy(Audio a) { // 오디오 구입 메서드  
		money = money - a.price;
		bonusPoint = bonusPoint + a.bounsPoint;
	}
	
	 */
	
	// 하지만 매개변수의 다형성을 적용하면 하나의 메서드로 간단히 처리 가능.
	void buy(Product p) {
		// 매개변수가 Product타입의 참조변수라는 것은
		// 메소드의 매개변수로 Product클래스의 자손타입의 참조 변수면 
		// 어느것이나 매개변수로 받아 들일 수 있다는 뜻  
		// Product클래스에 price와 bonusPoint가 선언되어 있기 때문에,  
		// 참조변수 p로 인스턴스의 price와 bonusPoint 사용이 가능 
		if(money<p.price) {
			System.out.println("잔액 부족으로 물건을 살 수없습니다.");
			return;
		}
		
		money -=  p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다 
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다 
		System.out.println(p + "을 구입하셨습니다. ");
	}

}


public class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다. ");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다. ");
	}
}
