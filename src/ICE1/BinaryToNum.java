package ICE1;

import java.util.Scanner;

public class BinaryToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = scanner.nextInt();
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        System.out.println(binary);
    }
}
