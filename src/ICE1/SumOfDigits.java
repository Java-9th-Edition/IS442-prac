package ICE1;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumDigits(123));
        System.out.println(sumDigits(-123));
        System.out.println(sumDigits(345));
        System.out.println(sumDigits(-345));

    }
    public static int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
