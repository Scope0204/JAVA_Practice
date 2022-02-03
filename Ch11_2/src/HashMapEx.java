import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234"); // 키 - 값으로 저장 
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // 중복된 키를 허용하지 않기때문에, 기존의 값을 덮어씀 : 1111 => 1234 
		// map은 key 는 중복안됨. value는 중복을 허용. 
		
		Scanner s = new Scanner(System.in); // 화면으로부터 라인단위로 입력받음
		
		while(true) {
			System.out.println("id와 password를 입력해 주세여. ");
			System.out.print("id: ");
			String id = s.nextLine().trim();
			
			System.out.print("password: ");
			String password = s.nextLine().trim(); // trim() : 좌우 공백 제거 
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다."+ " 다시입력해주세요. ");
				continue;
			}
			else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요. ");
				}
				else {
						System.out.println("id와 비밀번호가 일치합니다.");
						break;
					}
				}
				
			}
		}//while 
	}//main

