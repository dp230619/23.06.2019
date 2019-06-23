
public class BlockedState extends LoginState{

	public BlockedState(Context ctx) {
		super(ctx);
	}

	@Override
	public void loginSucceeded() {
		System.out.println("Blocked....");
	}

	@Override
	public void loginFailed() {
		System.out.println("Blocked....");
	}

}
