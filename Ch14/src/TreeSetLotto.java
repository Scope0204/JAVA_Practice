import java.util.*;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i = 0 ; set.size()<6 ; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(num); // set.add(new Integer(num));
			
		}
		// TreeSet은 저장할 때 정렬하기 때문에 읽어올 때 따로 정렬할 필요가 없다.
		// HashSet을 사용했을때 : List list = new LinkedList(set); Collections.sort(list);
		
		System.out.println(set);

	}

}
