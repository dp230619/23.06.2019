
public class Main {

	public static void main(String[] args) {
		Context ctx = new Context();
		ctx.init(new NewLoginState(ctx));
	}

}
