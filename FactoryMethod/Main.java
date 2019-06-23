
public class Main {

	public static void main(String[] args) {

		// add scanner input from user
		String userInput = "Car";
		
		Vehicle v = new VehicleFactory().CreateVehicle(userInput);
		

	}

}
