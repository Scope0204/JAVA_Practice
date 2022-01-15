final class Card2{
	String kind;
	int number;
	
	Card2(){
		this("SPADE",1);
	}
	Card2(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
  
	public String toString() { 
		return kind + ":" + number;
	}
}

public class GetClassEx {
  	public static void main(String[] args) throws Exception {
  		Card2 c = new Card2("HEART",3); // new연산자로 객체 생성
  		Card2 c2 = Card2.class.newInstance(); // Class객체를 통해서 객체 생성
  		
  		Class cObj = c.getClass();
  		
  		System.out.println(c);
  		System.out.println(c2);
  		System.out.println(cObj.getName());
  		System.out.println(cObj.toGenericString());
  		System.out.println(cObj.toString());

	}

}
