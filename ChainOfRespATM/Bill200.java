
public class Bill200 extends BillHandler{

	@Override
	public void handle(int amount) {
		if (amount >= 200)
		{
			System.out.println("Giving 200 X " + amount / 200);
		}
		if (amount % 200 > 0)
		{
			if (next != null)
			{
				next.handle(amount % 200);
			}
		}
	}

}
