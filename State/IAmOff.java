
public class IAmOff extends LightState{

	@Override
	public LightState turnOn() {
		System.out.println("Turning on....");
		return new IAmOn();
	}

	@Override
	public LightState turnOff() {
		System.out.println("Turning off....");
		return new IAmOff();
	}

}
