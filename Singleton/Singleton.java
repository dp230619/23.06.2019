
public class Singleton {

	
	
	// comment
	private static Singleton INSTANCE;
	
	private static Object key = new Object();

	// comment
	protected Singleton() {

	}

	public static Singleton getInstance()
	{
		if (INSTANCE != null)
			return INSTANCE;

		// call private methods
		synchronized (key)
		{
			if (INSTANCE == null) {
				INSTANCE = new Singleton();
			}
		}

		return INSTANCE;
	}
}
