import controller.UserController;
import view.ConsoleView;
import view.PanesView;

public class Main {

    public static void main(String[] args) {
        UserController controller = new UserController(new ConsoleView());
        //UserController controller = new UserController(new PanesView());
        controller.run();
    }

}
