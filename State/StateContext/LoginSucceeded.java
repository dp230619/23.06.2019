
public class LoginSucceeded extends LoginState{

	public LoginSucceeded(Context ctx) {
		super(ctx);
	}

	@Override
	public void loginSucceeded() {
		System.out.println("Already logged in ....");
	}

	@Override
	public void loginFailed() {
		System.out.println("Already logged in ....");
	}

}
