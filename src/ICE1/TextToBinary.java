package ICE1;

import java.util.Scanner;

public class TextToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        String binary = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            String letterBinary = Integer.toBinaryString(letter);
            if (letterBinary.length() < 8) {
                int padding = 8 - letterBinary.length();
                for (int j = 0; j < padding; j++) {
                    letterBinary = "0" + letterBinary;
                }
            }
            System.out.println("Letter: " + letter);
            System.out.println("Binary: " + letterBinary);
            binary += letterBinary;
        }
        System.out.println(binary);
    }
}
