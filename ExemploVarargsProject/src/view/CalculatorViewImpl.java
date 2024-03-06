package view;

public class CalculatorViewImpl implements CalculatorView{

    @Override
    public void showResult(String message, double result) {
        System.out.printf("%s: %.3f \n", message, result);
    }

}
