package ICE2;

public class Rational {
    private int numerator = 1;
    private int denominator = 1;

    public Rational(int a, int b){
        this.numerator = a;
        this.denominator = b;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public static Rational add(Rational rat1, Rational rat2){
        int newNumerator = (rat1.getNumerator() * rat2.getDenominator()) + (rat1.getDenominator() * rat2.getNumerator());
        int newDenom = rat1.getDenominator() * rat2.getDenominator();

        return new Rational(newNumerator, newDenom);
    }

    public static Rational subtract(Rational rat1, Rational rat2){
        int newNumerator = (rat1.getNumerator() * rat2.getDenominator()) - (rat1.getDenominator() * rat2.getNumerator());
        int newDenom = rat1.getDenominator() * rat2.getDenominator();

        return new Rational(newNumerator, newDenom);
    }

    public static Rational multiply(Rational rat1, Rational rat2) {
        int newNumerator = rat1.getNumerator() * rat2.getNumerator();
        int newDenom = rat1.getDenominator() * rat2.getDenominator();

        return new Rational(newNumerator, newDenom);
    }

    public static Rational divide(Rational rat1, Rational rat2) {
        int newNumerator = rat1.getNumerator() * rat2.getDenominator();
        int newDenom = rat1.getDenominator() * rat2.getNumerator();

        return new Rational(newNumerator, newDenom);
    }

}
