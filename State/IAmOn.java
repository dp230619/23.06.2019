
public class IAmOn extends LightState{

	@Override
	public LightState turnOn() {
		System.out.println("I am already on....");
		return this;
	}

	@Override
	public LightState turnOff() {
		System.out.println("Turning off....");
		return new IAmOff();
	}

}
