
public class Car extends Vehicle {

	private int year;
	
	public Car(String model, int year) {
		super(model);
		this.year = year;
	}

	@Override
	public String toString() {
		return super.toString() +  " Car [year=" + year + "]";
	}

}
