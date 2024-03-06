import controller.Controller;
import view.ConsoleView;

public class Main {

    public static void main(String[] args) {
        new Controller(new ConsoleView()).run();
    }

}
