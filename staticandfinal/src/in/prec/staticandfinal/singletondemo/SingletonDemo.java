package in.prec.staticandfinal.singletondemo;

public class SingletonDemo {
	private static SingletonDemo object1;
	private SingletonDemo() {
		
	}
	static {
		object1=new SingletonDemo();
	}
	public static SingletonDemo getObject() {
		return object1; 
	}
	public static void main(String[]args) {
		
		SingletonDemo obj1= SingletonDemo.getObject();
		SingletonDemo obj2=  SingletonDemo.getObject();
		System.out.println(obj1==obj2);
		
	}
}
