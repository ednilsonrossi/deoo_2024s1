package controller;

import model.Rational;
import view.AverageRationalView;

public class Controller {

    private AverageRationalView view;

    public Controller(AverageRationalView view){
        if(view == null)
            throw new IllegalArgumentException("View argument can not be null.");
        this.view = view;
    }

    public void average(){
        Rational number, sum, average;
        int quantity;

        quantity = 0;
        sum = Rational.of(0, 1);
        do{
            number = view.readRational();
            sum = sum.sum(number);
            quantity++;
        }while (!view.finishReading());

        if (quantity != 0){
            number = Rational.of(1, quantity);
            average = sum.multiplication(number);
            view.showRational("Média: ", average);
        }
    }
}
