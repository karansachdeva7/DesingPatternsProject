package creational.singleton;

public class Client {
	
	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstance();
		boolean result = obj instanceof SingletonClass;
		System.out.println(result);
		System.out.println("obj class name is: " + obj.getClass().getSimpleName());
	}
}
