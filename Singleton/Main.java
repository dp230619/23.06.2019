
public class Main {

	public static void main(String[] args) {
		
		// 1. Prevent from creation in code
		
		// 2. Only one instance of this class will be created
		
		// 3. Thread-safe
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
			
		
		
	}

}
