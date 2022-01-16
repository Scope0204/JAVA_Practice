
public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));
		
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println(s==s2); 
		System.out.println(s.equals(s2)); //true. 
		
		sb.append("123").append("ddd");
		System.out.println(sb);

	}

}
