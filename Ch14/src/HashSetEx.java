import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet(); 
		
		for(int i = 0 ; i < objArr.length; i ++ ) {
			set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다
			// set인터페이스의 특징대로 중복된요소들을 저장하지않는다. 순서도 다를 수 있다(다음 예제에서 해봄)    
			// 1의 경우, "1" -> String 인스턴스 , new Integer(1) -> Integer 인스턴스 
		}
		
		// HashSet에 저장된 요소들을 출력한다.
		System.out.println(set); // 1 1 2 3 4 

	}
}
