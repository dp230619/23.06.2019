
public class NewLoginState extends LoginState{

	public NewLoginState(Context ctx) {
		super(ctx);
	}

	@Override
	public void loginSucceeded() {
		ctx.loginState = new LoginSucceeded(ctx);
		
	}

	@Override
	public void loginFailed() {
		ctx.loginState = new LoginSucceeded(ctx);
		
	}

}
