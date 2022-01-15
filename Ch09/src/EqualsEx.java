class Person{
	long id;
	
	//equals메서드를 오버라이딩
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person ) {
			// obj가 Object타입이므로 id값을 참조하기 위해서는 Person타입으로 형변환 필
			return id == ((Person)obj).id;
		}
		else {
			// instanceof 가 false 인 경우 = 값이 없거나 타입이 Person이 아닌 경우
			return false; 
		}
	}
	
	Person(long id){
		this.id = id;
	}
}


public class EqualsEx {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		String p3 = new String("8011081111222L");
		String p4 = new String("8011081111222L");
		
		// String,Date,File클래스 는 equals 메서드가 오버라이딩 되어있다.
		// 다 주소값이 아닌 내용을 비교하도록 오버라이딩되어 있다.
		// 다만, StringBuffer클래스는 예외로 오버라이딩되어 있지않다. 
		if(p3.equals(p4)) {
			System.out.println("p3와 p4는 같은사람입니다. ");
		}
		else {
			System.out.println("p3와 P4는 다른사람입니다. ");
		}
		
		if(p1==p2) {
			System.out.println("p1과 p2는 같은사람입니다. ");
		}
		else {
			System.out.println("p1과 p2는 다른사람입니다. ");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은사람입니다. ");
		}else {
			System.out.println("p1과 p2는 다른사람입니다. ");
		}
	}
}
