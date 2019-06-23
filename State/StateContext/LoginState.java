
public abstract class LoginState {
	
	protected Context ctx;

	public LoginState(Context ctx) {
		super();
		this.ctx = ctx;
	}
	
	public abstract void loginSucceeded();
	
	public abstract void loginFailed();
	
}
