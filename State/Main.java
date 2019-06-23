
public class Main {

	public static void main(String[] args) {
		
		Context myContext = new Context();
		
		myContext.init(new IAmOff());
		
		myContext.turnOn();
		myContext.turnOn();
		myContext.turnOn();
		myContext.turnOff();
		myContext.turnOn();
		myContext.turnOff();
		myContext.turnOn();

	}

}
