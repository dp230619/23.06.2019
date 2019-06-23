
public class Main {

	public static void main(String[] args) {
		
		BillHandler bill200 = new Bill200();
		BillHandler bill100 = new Bill100();
		BillHandler bill25 = new Bill25();
		BillHandler coin5 = new Coin5();
		
		bill200.setNext(bill100);
		bill100.setNext(bill25);
		bill25.setNext(coin5);
		coin5.setNext(null);
		
		bill200.handle(585);
		System.out.println("================");
		bill200.handle(0);
		System.out.println("================");
		bill200.handle(200);

	}

}
