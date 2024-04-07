package model;

public class Rational {

    private int numerator;
    private int denominator;

    private Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    private Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Rational of(int numerator, int denominator) throws NumberFormatException {
        if (denominator == 0) {
            throw new NumberFormatException("There is no zero denominator.");
        }
        if (numerator < 0 || denominator < 1) {
            throw new NumberFormatException("This implementation does not support negative numbers.");
        }
        return new Rational(numerator, denominator);
    }

    public static Rational copy(Rational rational) {
        if (rational == null) {
            throw new NullPointerException("The argument rational can not be NULL.");
        }
        return new Rational(rational.numerator, rational.denominator);
    }

    public void simplify() {
        int mdc = RationalUtil.mdc(numerator, denominator);
        numerator = numerator / mdc;
        denominator = denominator / mdc;
    }

    public Rational sum(Rational other) {
        if (other != null) {
            Rational sumRational = new Rational();
            sumRational.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
            sumRational.denominator = this.denominator * other.denominator;
            sumRational.simplify();
            return sumRational;
        } else {
            throw new IllegalArgumentException("Other argument can not be null.");
        }
    }

    public Rational multiplication(Rational other) {
        if (other == null) {
            throw new IllegalArgumentException("Other argument can not be null.");
        } else {
            Rational product = new Rational();
            product.numerator = this.numerator * other.numerator;
            product.denominator = this.denominator * other.denominator;
            product.simplify();
            return product;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
