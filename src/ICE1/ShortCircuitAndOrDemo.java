package ICE1;

public class ShortCircuitAndOrDemo {
    public static void main(String[] args) {
        char c = 'a';
        int age = 9;
        // in normal AND (&) operator, if the first operand is false, the second operand will not be evaluated
        // in short-circuit AND (&&) operator, the second operand is evaluated only when necessary

        // in this example, the second operand is not evaluated because the first operand is false
        if (c != 'a' && ++age == 10) {
            age++;
        }
        System.out.println(age);  // output: 9

        // here the second operand is evaluated because the first operand is true
        if (c == 'a' && ++age == 10) {
            age++;
        }
        System.out.println(age);  // output: 11

        // here the second operand is evaluated because a normal AND will evaluate all comparisons in the expression
        if (c == 'a' & ++age == 10) {
            age++;
        }
        System.out.println(age);  // output: 11


    }
}
