import java.util.ArrayList;

//지네릭 클래스 
class Fruit{
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit {
	public String toString() { 
		return "Apple";
	}
}
class Grape extends Fruit { public String toString() { return "Grape"; } }
class Toy { public String toString() { return "Toy"; } } 

public class FruitBoxEx {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple> // error. 타입 불일치 
		
		//void add(Fruit item)
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // ok. apple이 fruit의 자손. 
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // error. Box<Apple>은 Apple만 담을 수 있음 
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); error. Box<Toy>에는 Apple을 담을 수 없음 
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

	}

}

class Box<T> { 
	ArrayList <T> list = new ArrayList<T>(); // 여러 객체를 저장할 수 있도록 함.
	
	void add(T item) { list.add(item);}
	T get(int i) {return list.get(i);}
	int size() { return list.size(); } 
	public String toString() { return list.toString();}  
}