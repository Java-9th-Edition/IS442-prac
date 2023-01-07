package ICE1;

public class BitwiseOperatorsDemo {
    // bitwise operators
    public static void main(String[] args) {
        int x = 0b100110100011;
        System.out.println(Integer.toBinaryString(x << 1));
        System.out.println(Integer.toBinaryString(x << 2));
        System.out.println(Integer.toBinaryString(x << 3));

        System.out.println();

        int z = 0b100110100011;
        System.out.println(Integer.toBinaryString(z >> 3));
        System.out.println(Integer.toBinaryString(z >> 2));
        System.out.println(Integer.toBinaryString(z >> 1));

        System.out.println();

        int y = 0b1111111111000000;
        System.out.println(Integer.toBinaryString(y >>> 3));
        System.out.println(Integer.toBinaryString(y >>> 2));
        System.out.println(Integer.toBinaryString(y >>> 1));

        System.out.println();

        int a = -54;
        int b = -54;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(a >> 2));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 2 ));

    }
}
