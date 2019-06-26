
public class Main {

	public static void main(String[] args) {

		StockGrabber grabber = new StockGrabber();
		IObserver stockObs = new StockObserver("smart person", grabber);
		IObserver stockObsRich = new StockObserver("rich person", grabber);
		
		grabber.setApplePrice(101.5);
		grabber.setIbmPrice(88.6);
		grabber.setGooglePrice(43.2);
		
		grabber.unregister(stockObsRich);
		
		grabber.setGooglePrice(43.2);
		
	}

}
