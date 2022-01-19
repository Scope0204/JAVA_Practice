import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat"); 
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower"); 
		
		System.out.println(set); // Car,dZZZZ위치가 순서와 다른 이유: 대문자가 소문자보다 우선시. 섞여있는 경우도 마찬가지.   
		System.out.println("range search : from " + from + " to " + to);
		//subSet()을 이용해서 범위검색을 할 때 시작범위는 포함되지만, 끝 범위는 포함되지않는다. 
		System.out.println("result1 : " + set.subSet(from, to));
		// 단 끝 범위에 문자를 추가하는만큼범위를 설정할 수 있다.
		set.add("");
		System.out.println("result2 : " + set.subSet(from, to + "zzzz")); // dzzzz 보다 앞의 문자들을 출력 
		System.out.println("result2 : " + set.subSet(from, to + "zzzzz")); // dzzzzz 보다 앞의 문자들을 출력 
		
	}

}
