package ICE1;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseSentence("I hate Java"));
        System.out.println(reverseSentence("This is difficult"));
        System.out.println(reverseSentence("but I've figured it out"));
        System.out.println(reverseSentence("I love Java"));
    }

    public static String reverseSentence(String s){
        String[] words = s.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--){
            reversed += words[i] + " ";
        }
        return reversed;
    }
}
