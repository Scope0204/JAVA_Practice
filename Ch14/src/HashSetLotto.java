import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size()<6 ; i++ ) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num)); // 어차피 중복되는 값은 저장되지않는다. size가 6이 될 때 까지 반복한다. 
		}
		
		List list = new LinkedList(set); // LinkedList(Collection c) 
		Collections.sort(list);  // Collections.sort(List list)  
		System.out.println(list);

	}

}
