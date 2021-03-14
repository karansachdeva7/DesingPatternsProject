package structural.proxy;

public class Client {
	
	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		try {
			internet.connectTo("www.google.com");
			internet.connectTo("www.abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
