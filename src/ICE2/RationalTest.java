package ICE2;

import java.util.Scanner;

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

        System.out.println("For r = " + numOne + "/" + denomOne + " and s = " + numTwo + " / " + denomTwo);
        System.out.println("r + s =" + )



    }
}
