@FunctionalInterface
interface MyFunction { 
	void run(); // public abstract void run();
}

public class LambdaEx {

	static void execute(MyFunction f) //매개변수 타입이 MyFunction인 메서드" 
	{
		f.run();
	}
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;  // return () -> {};
	}
	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		//익명클래스로 run 구현 
		MyFunction f2 = new MyFunction() { 
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(() -> System.out.println("run()"));
 
	}

}
