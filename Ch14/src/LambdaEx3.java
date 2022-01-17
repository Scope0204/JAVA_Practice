import java.util.*;
import java.util.function.*;

public class LambdaEx3 {

	public static void main(String[] args) {
		// 매개변수는 없고, 반환값만 있음 : 1~100 난수  
		Supplier<Integer> s = () -> (int)(Math.random()*100) + 1 ;
		// 매개변수만 있고, 반환값이 없음 : i 
		Consumer<Integer> c = i -> System.out.print(i+", ");
		// 조건식. 매개변수 하나, 반환값 boolean : 짝수인지 검사  
		Predicate<Integer> p = i -> i%2 == 0;
		// 일반적인 함수. 매개변수 하나, 결과를 반환 : i/10*10을 하여 1의 자리를 없앰  
		Function<Integer, Integer> f = i -> i/10*10;
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list); // list를 랜덤값으로 채운다
		System.out.println(list);
		printEventNum(p,c,list);//짝수를 출력 
		List<Integer> newList = doSomething(f,list);
		System.out.println(newList);
	
	}

	
//	Function<Integer, Integer> f = i -> i/10*10;
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size()); //같은 사이즈의 새로운 리스트 생성  
		
		for(T i : list) {
			newList.add(f.apply(i)); // 일의 자리를 없애서 새로운 list에 저장  
		} 
		return newList;
	}



	// Consumer<Integer> c = i -> System.out.print(i+", ");
	// Predicate<Integer> p = i -> i%2 == 0;
	static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) { //list에 있는 모든 요소들을 검사 
			if(p.test(i)) // 짝수인지 검사(Predicate)
				c.accept(i); //화면에 i출력(Consumer) 
		}
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		// TODO Auto-generated method stub
		for(int i=0; i<10 ; i++) {
			list.add(s.get()); // Supplier로부터 1~100의 난수를 받아서 list에 추가 
		}
	}

}
