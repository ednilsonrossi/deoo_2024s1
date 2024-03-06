package model;

public class Calculator {

    public static double arithmeticAverage(double... values){
        var sum = 0.0;

        for(double value : values){
            sum += value;
        }

        return sum / values.length;
    }
}
