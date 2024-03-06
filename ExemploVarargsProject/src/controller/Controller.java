package controller;

import model.Calculator;
import view.CalculatorView;

public class Controller {
    private CalculatorView view;

    public Controller(CalculatorView view){
        this.view = view;
    }

    public void run(){
        view.showResult("Média Aritmética: ", Calculator.arithmeticAverage(3.5, 7.2, 8.9));
        view.showResult("Média Aritmética: ", Calculator.arithmeticAverage(5.0, 10.0, 15.0, 20.0));
        view.showResult("Média Aritmética: ", Calculator.arithmeticAverage(2.0, 4.0));
    }
}
