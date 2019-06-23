
public abstract class BillHandler {

	protected BillHandler next;
	
	public void setNext(BillHandler next)
	{
		this.next = next;
	}
	
	public abstract void handle(int amount);
	
}
