package view;

public class ConsoleView implements View{

    @Override
    public void showClient(String name) {
        System.out.println("Cliente: " + name);
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
