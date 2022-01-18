import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// .sublist(int forindex , int toindex) : fromindex로부터 toindex사이에 저장된 객체를 반환한다
		ArrayList list2= new ArrayList(list1.subList(1, 4)); // 4 2 0 을 list2에 새롭게 저장 
		print(list1, list2);
		
		// list1과 list2를 정렬한다
		Collections.sort(list1); // Collection (x) , Collections (o) 
		Collections.sort(list2); 
		print(list1, list2);
		
		// list1에 list2가 전부 포함되어있는지 확인하는 메서드 
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		// list2에 객체 추가 
		list2.add("B");
		list2.add("C"); 
		list2.add(3, "A"); // list2[3] 에 객체 추가. 뒤에 밀려남 
		print(list1, list2); 
		
		// 주어진 객체를 지정된 위치(3)에 저장한다. 기존의 것은 삭제 
		list2.set(3,"AA");
		print(list1,list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제하는 메서드. 
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2) );
		print(list1, list2); // 0 2 4 만 남게됨 
		
		// list2에서 list1에 포함된 객체들을 삭제한다
		for(int i = list2.size() -1 ; i >=0 ; i-- ) {
			if(list1.contains(list2.get(i)))
				list1.remove(i); 
		}
		print(list1,list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		// TODO Auto-generated method stub
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();
	}

}
