import controller.Controller;
import view.Console;

public class Main {

	public static void main(String[] args) {
		
		new Controller(new Console()).run();

	}

}
