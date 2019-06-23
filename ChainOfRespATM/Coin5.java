
public class Coin5 extends BillHandler{

	@Override
	public void handle(int amount) {
		if (amount >= 5)
		{
			System.out.println("Giving 5 X " + amount / 5);
		}
		if (amount % 5 > 0)
		{
			if (next != null)
			{
				next.handle(amount % 5);
			}
		}
	}

}
