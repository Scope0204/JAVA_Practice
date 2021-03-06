interface Parseable{ 
	//구문 분석작업을 수행
	public abstract void parse(String fileName);
}

// 인터페이스 Parseable을 클래스 ParserManager가 구현했을때, 
// Fighter인스턴스를 Fightable타입의 참조변수(p)로 참조하는 것이 가능하다.
class ParserManager {
	
	//메서드의 리턴타입이 Parseable인터페이스 이다.
	//리턴타입이 인터페이스라는 것은
	//메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 의미이다! (중요)
	//new XMLParser 과 new HTMLParser을 반환한다 
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}
		else {
			Parseable p = new HTMLParser();
			//또는 Parseable p = (Fightable)new Fighter(); 
			//p 로는 인터페이스에 정의된 멤버들만 호출이 가능하다 (XMLParser , HTMLParser)  
			
			//메서드의 리턴타입으로 인터페이스의 타입을 지정. 
			return p;
			// return new HTMLParesr(); 과 같
		}
	}
}

class XMLParser implements Parseable{
	public void parse(String fileName) {
		//구문 분석작업을 수행하는 코드
		System.out.println(fileName + "- XML parsing completed");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		//구문 분석작업을 수행하는 코드
		System.out.println(fileName + "- HTML parsing completed");
	}
}


public class ParserTest {
	public static void main(String args[]) {
		Parseable parser  = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
