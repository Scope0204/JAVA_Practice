// 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직(원래는)
class MyMath2 {
	long a,b;
	
	//인스턴스 변수 a,b이용해서 작업하므로 매개변수 필요
	long add() { return a+b;} // a,b는 인스턴스 변수
	long subtract() { return a+b;} 
	long multiply() { return a+b;} 
	double divide() { return a+b;} 
	
	//인스턴스 변수 관계없이 매개변수만으로 작업 가능
	static long add(long a, long b) { return a+b; } //a,b는 지역변수
	
}

public class MyMathTest2 { // 소스파일의 이름은 public class 이름과 일치 

	public static void main(String[] args) {
		// 클래스 메서드 호출, 인스턴스 생성없이 호출 가능
		System.out.println(MyMath2.add(200L,100L));
	}

}

