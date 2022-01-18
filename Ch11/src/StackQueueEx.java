import java.util.*;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList를 사용  
	
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		// 둘다 0,1,2순으로 저장
		
		System.out.println("<Stack>");
		while(!st.empty()) {
			System.out.println(st.pop()); // 스택에서 객체를꺼냄 : 후입 선출 
		}
		
		System.out.println("<Queue>");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // 큐에서 객체를 꺼냄 : 선입 선출 
		}
		
	}

}
