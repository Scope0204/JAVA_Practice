
public class StringEx {

	public static void main(String[] args) {
		String s1 = "AAA"; // "AAA" 라는 문자 리터럴을 지정 
		String s2 = "AAA";
		String s3 = "AAA";
		// s1,s2,s3는 AAA String 인스턴스를 참조한다(주소값이 같다)
		String s4 = "BBB";
		String s5 = new String("AAA"); // 새로운String 인스턴스 생성 
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s5));
		System.out.println(s1==s5); //false
	}

}
