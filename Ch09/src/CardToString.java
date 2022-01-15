class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	//오버라이딩
	//Object클래스에 정의된 toString()의 접근제어자가 public이므로 
	//조상(Object 클래스)보다 접근범위가 같거나 더 넓어야 하기 때문에 public을 쓴
	public String toString() { 
		return "kind: "
				+ kind + 
				", number: " + 
				number;
	}
}
public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
