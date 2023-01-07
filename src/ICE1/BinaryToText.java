package ICE1;

import java.util.Scanner;

public class BinaryToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine().trim();

        String text = "";

        for (int i = 0; i < binaryInput.length(); i += 8) {
            int asciiNumber = Integer.parseInt(binaryInput.substring(i, i+8),2);
//            System.out.println("asciiNumber:"+ asciiNumber);
            text += (char) asciiNumber;
        }
        System.out.println(text);

    }
}
