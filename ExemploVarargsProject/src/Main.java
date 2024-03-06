import controller.Controller;
import view.CalculatorViewImpl;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new CalculatorViewImpl());
        controller.run();
    }
}
