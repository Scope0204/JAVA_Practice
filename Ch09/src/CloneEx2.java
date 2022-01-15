import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; 
		// 배열도 객체이기 때문에 Object클래스를 상속받는다. 
		// 동시에 Cloneable, Serializable 인터페이스가 구현되어 있다.
		
		// 배열은 기본적으로 public 으로 clone()이 오버라이딩 되어 있어 직접적으로 호출이 가능하다. 
		// 그리고, 원본과 같은 타입을 반환하므로 형변환이 필요없다(공변 반환타입을 제공한다)
		int[] arrClone = arr.clone(); 
		int[] arrClone2 = new int[arr.length]; // 또 다른 방법 : 배열을 생성하고 
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.arraycopy(arr,0,arrClone2,0,arr.length); // 내용을 복사한다. 
		System.out.println(Arrays.toString(arrClone2)); // 배열의 내용을 복사(clone보다는 코드도 길어지고 복잡하다) 

		//이 외에도 java.util패키지의 Vector , ArrayList, LinkedList .. 이와같은 방식으로 복제가 가능하다. 
		//clone()으로 복제가 가능한 클래스인지 확인하기 위해서는 Cloneable이 구현되었는지 JavaAPI에서 확인하면 됨. 
		
		
	}

}
