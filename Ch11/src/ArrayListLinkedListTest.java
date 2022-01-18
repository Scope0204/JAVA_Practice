import java.util.*;


public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		// 추가할 데이터의 개수를 고려하여 충분히 잡는 것이 좋다  
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("<순차적으로 추가하기>");
		System.out.println("ArrayList: " + add1(al));
		System.out.println("LinkendList: " + add1(ll));
		System.out.println();  
		
		System.out.println("<중간에 추가하기>");
		System.out.println("ArrayList: " + add2(al));
		System.out.println("LinkendList: " + add2(ll));
		System.out.println();
		
		System.out.println("<중간에서 삭제하기>");
		System.out.println("ArrayList: " + remove2(al));
		System.out.println("LinkendList: " + remove2(ll));
		System.out.println();
		
		System.out.println("<순차적으로 삭제하기>");
		System.out.println("ArrayList: " + remove1(al));
		System.out.println("LinkendList: " + remove1(ll));
		System.out.println();
		
		System.out.println("순차적으로 추가/삭제하는 경우는 ArrayList가 더 빠르다");
		System.out.println("충분하게 초기용량을 확보하였기 때문에 단순 차례대로 추가하는 속도는 빠르다. ");
		System.out.println("순차적으로 삭제한다는 것은 역순으로 삭제해나간다는 것을 의미하기 때문에, 재배치가 필요없는 ArrayList가 빠르다");
		System.out.println();
		System.out.println("중간데이터를 추가/삭제하는 경우는 LinkedList가 더 빠르다");
		System.out.println("각 요소간의 연결만 변경해주면 되서 빠르다. ");
		System.out.println("ArrayList의 경우 각 요소들을 재배치하기 때문에 느리다. ");
		
	}
	

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i < 1000000; i ++) list.add(i+""); 
		long end = System.currentTimeMillis();
		return end - start;
	}
	

	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i < 10000; i ++) list.add(500+"X"); 
		long end = System.currentTimeMillis();
		return end - start;
	}
	

	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i =list.size()-1 ; i>=0 ; i--) list.remove(i); 
		long end = System.currentTimeMillis();
		return end - start;
	}
	

	public static long remove2 (List list) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i < 10000; i ++) list.remove(i); 
		long end = System.currentTimeMillis();
		return end - start;
	}

}
