import java.util.*;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);

		Set set = map.entrySet(); // 키와 값을 함께 읽어올 수 있
		Iterator it = set.iterator(); 
//ArrayList 에서는 순서가 정해져 있어서  get(i) 인덱스번호로 순회할수있는데
//Set 인터페이스는 순서대로 지정할수없어서 있는걸 뺴내는 방식인데 Interator 객체를 이용해서 사용할수있다.

		while(it.hasNext()) { //boolean hasNext() : 이후에 요소가 더 있는지 체크하는 메서드 
			Map.Entry e = (Map.Entry)it.next(); //E next(): 다음의 요소를 반환 
			// 각각 키와 값을 얻어옴 
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}

		set = map.keySet(); //저장된 모든 키값을 받아 옴 
		System.out.println("참가자 명단 : " + set);

		Collection values = map.values(); // 저장된 모든 값을 컬렉션 형태로 받아옴 
		it = values.iterator();

		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}
}