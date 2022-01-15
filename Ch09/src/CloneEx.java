class Point implements Cloneable{
	//Cloneable인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
	//그렇지 않으면 clone()을 호출할 수 있다.
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x= "+x+", y= "+y;
	}
	
	//오버라이딩. 접근제어자 public 변경해줘야 호출 가능
	//JDK1.5부터 공변 반환타입 기능이 추가 : 오버라이딩할 때, 조상메서드의 반환타입을 자손클래스의 타입으로 변경할 수있음.
	
	public Point clone() { // public Object clone(){ 에서 반환타입 변경 
		Object obj = null;
		// try-catch
		try {
			obj = super.clone(); // clone은 반드시 예외처리를 해 주어야한다. 
			
		}catch(CloneNotSupportedException e){
			
		}
		return (Point)obj; // point반환타입으로 형변환(공변 반환타입) 
		//조상의 타입이 아닌(Object) , 자속 객체의 타입으로 반환할 수 있어 번거로운 형변환이 줄어듬.
	}
}

public class CloneEx {

	public static void main(String[] args) {
		Point original = new Point(3,5);
		// 복제해서 새로운 객체 생성
		//Point copy = (Point)original.clone(); 으로 해야하나, 공변 반환타입으로 인해 형변환 과정을 앞에서 함
		Point copy = original.clone();
		System.out.println(original);
		System.out.println(copy);

	}

}
