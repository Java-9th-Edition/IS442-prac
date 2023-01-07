package ICE1;

import java.util.Scanner;

public class FirstTwoCharacters {
    public static void main(String[] args){
        // prompt user for first word and second word
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        while (!checkFirstTwoChar(firstWord, secondWord)){
            System.out.println("The first two characters of the first word must match the first two characters of the second word.");
            System.out.print("Enter first word: ");
            firstWord = scanner.nextLine();

            System.out.print("Enter second word: ");
            secondWord = scanner.nextLine();
        }
        System.out.println("Bingo!");

    }

    public static Boolean checkFirstTwoChar(String s1, String s2){
        return s1.substring(0,2).equals(s2.substring(0,2));
    }
}
