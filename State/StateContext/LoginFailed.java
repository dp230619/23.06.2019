
public class LoginFailed extends LoginState{

	private int counter = 0;
	
	public LoginFailed(Context ctx) {
		super(ctx);
	}

	@Override
	public void loginSucceeded() {
		ctx.loginState = new LoginSucceeded(ctx);
	}

	@Override
	public void loginFailed() {
		counter++;
		if (counter > 3)
			ctx.loginState = new BlockedState(ctx);
	}

}
