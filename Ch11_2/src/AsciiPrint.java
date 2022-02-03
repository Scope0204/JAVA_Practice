
public class AsciiPrint {
	public static void main(String[] args) {
		char ch = ' ';
		for(int i = 0; i < 95 ; i++ ) // 공백(' ')이후의 문자들을 출력한다.
			System.out.print(ch++); // 문자열의 정렬순서를보여준다.
		//문자의 코드값을 기준으로 정렬되며, 공백,숫자,대문자,소문자 ...  
	}
}
