
public class Context {
	
	LoginState loginState = null;
	
	public void init(LoginState loginState )
	{
		this.loginState = loginState;
	}
	
	public void loginSucceeded()
	{
		this.loginState.loginSucceeded();
	}
	
	public void loginFailed()
	{
		this.loginState.loginFailed();
	}
}
