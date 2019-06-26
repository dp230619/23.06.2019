
public class StockObserver  implements IObserver {

	protected String name;
	
	protected double ibmPrice;
	protected double applePrice;
	protected double googlePrice;
	
	public StockObserver(String name, ISubject subject) {
		super();
		this.name = name;
		
		if (subject != null)
		{
			subject.register(this);
		}
	}

	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;
		
		printThePrice();
	}

	private void printThePrice() {
		System.out.println("observer " + name + " got updated on stock prices: " +
				"IBM: " + this.ibmPrice + " APPLE: " + this.applePrice + " Google: " + this.googlePrice);
	}

	@Override
	public String toString() {
		return "StockObserver [name=" + name + "]";
	}	
}
