package ICE1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        String output = "";
        List<Integer> list = new ArrayList<Integer>();

        while (n >= 0) {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
            if (n >= 0) {
                list.add(n);
            }
        }

        for (int i : list) {
            output += i + " x ";
        }
        output = output.substring(0, output.length() - 3) + " = " + productOfList(list);
        System.out.println(output);
    }

    public static int productOfList(List<Integer> list){
        int product = 1;
        for (int i = 0; i < list.size(); i++){
            product *= list.get(i);
        }
        return product;
    }
}
