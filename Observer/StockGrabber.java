import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements ISubject {

	protected List<IObserver> observers = new ArrayList<IObserver>();
	
	protected double ibmPrice;
	protected double applePrice;
	protected double googlePrice;
	
	@Override
	public void register(IObserver observer) {
		System.out.println(observer + " is registered...");
		observers.add(observer);
	}

	@Override
	public void unregister(IObserver observer) {
		System.out.println(observer + " is no longer registered...");
		observers.remove(observer);
	}

	//
	// maybe not public ? 
	//
	@Override
	public void norifyObservers() {
		for(IObserver o : observers)
		{
			o.update(ibmPrice, applePrice, googlePrice);
			
		}
	}
	
	public void setIbmPrice(double newPrice)
	{
		this.ibmPrice = newPrice;
		
		this.norifyObservers();
	}
	
	public void setApplePrice(double newPrice)
	{
		this.applePrice = newPrice;
		
		this.norifyObservers();
	}
	
	public void setGooglePrice(double newPrice)
	{
		this.googlePrice = newPrice;
		
		this.norifyObservers();
	}

}
