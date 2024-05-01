import controller.Controller;
import view.ConsoleView;
import view.GuiView;

public class Main {

	public static void main(String[] args) {
		
		new Controller(new GuiView()).run();
		
	}
	
}
