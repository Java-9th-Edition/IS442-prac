package ICE2;

import java.util.Scanner;

import static ICE2.Rational.add;


public class RationalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator of a rational number: ");
        int numOne = sc.nextInt();

        System.out.print("Enter denominator of a rational number: ");
        int denomOne = sc.nextInt();

        Rational rat1 = new Rational(numOne, denomOne);

        System.out.print("Enter numerator of another rational number: ");
        int numTwo = sc.nextInt();

        System.out.print("Enter denominator of another rational number: ");
        int denomTwo = sc.nextInt();

        Rational rat2 = new Rational(numTwo, denomTwo);

        Rational addResult = add(rat1, rat2);
        Rational subtractResult = Rational.subtract(rat1, rat2);
        Rational multiplyResult = Rational.multiply(rat1, rat2);
        Rational divideResult = Rational.divide(rat1, rat2);

        System.out.println("For r = " + numOne + "/" + denomOne + " and s = " + numTwo + " / " + denomTwo);
        System.out.println("r + s = " + addResult.getNumerator() + "/" + addResult.getDenominator());
        System.out.println("r - s = " + subtractResult.getNumerator() + "/" + subtractResult.getDenominator());
        System.out.println("r * s = " + multiplyResult.getNumerator() + "/" + multiplyResult.getDenominator());
        System.out.println("r / s = " + divideResult.getNumerator() + "/" + divideResult.getDenominator());

    }
}
