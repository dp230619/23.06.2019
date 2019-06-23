public class Bill25 extends BillHandler{

	@Override
	public void handle(int amount) {
		if (amount >= 25)
		{
			System.out.println("Giving 25 X " + amount / 25);
		}
		if (amount % 25 > 0)
		{
			if (next != null)
			{
				next.handle(amount % 25);
			}
		}
	}

}
