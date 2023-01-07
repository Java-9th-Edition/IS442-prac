package ICE1;

import java.util.Scanner;

public class TriangleRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        char letter = 'a';
        String outputB = "";
        String outputC = "";
        String triangleRow = "";

        for (int i = 0; i < n; i++) {
            String temp = Integer.toString(i+1) + Integer.toString(i+2) + Integer.toString(i+3) + " ";
            outputB += temp;
            System.out.print((char) (letter + (i%26)) + " ");
            triangleRow += i+1;
            outputC += triangleRow + "\n";
        }
        System.out.println();
        System.out.println(outputB);
        System.out.println();
        System.out.println(outputC);
    }
}
