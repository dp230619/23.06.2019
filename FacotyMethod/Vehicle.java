
public abstract class Vehicle {
	
	private String model;

	public Vehicle(String model) {
		super();
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + "]";
	}
	
}
