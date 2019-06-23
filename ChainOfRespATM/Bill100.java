
public class Bill100 extends BillHandler{

	@Override
	public void handle(int amount) {
		if (amount >= 100)
		{
			System.out.println("Giving 100 X " + amount / 100);
		}
		if (amount % 100 > 0)
		{
			if (next != null)
			{
				next.handle(amount % 100);
			}
		}
	}

}