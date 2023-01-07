package ICE1;

public class AlignStrings {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < 5; i++){
            str += " ";
        }

        str = str + "World";
        System.out.println(str);

        System.out.println(alignStrings("Recess Week", "RcWk"));
        System.out.println(alignStrings("Java Programming Language", "amg"));
    }

    public static boolean alignStrings(String str1, String str2) {
        // Check if str1 is shorter than str2. If it is, return false.
        if (str1.length() < str2.length()) {
            return false;
        }

        // Initialize variables to keep track of the current position in each string.
        int str1Pos = 0;
        int str2Pos = 0;
        int str2Length = str2.length();
        String aligned = "";

        // Loop through both strings until we reach the end of str2.
        while (str2Pos < str2Length) {
            // If the characters at the current position in both strings match,
            // move on to the next character in both strings.
            if (str1.charAt(str1Pos) == str2.charAt(str2Pos)) {
                aligned += str1.charAt(str1Pos);
                str1Pos++;
                str2Pos++;
            } else {
                // If the characters do not match, insert a space into str2 and
                // move on to the next character in str1.
                aligned += " ";
                str1Pos++;
            }
        }

        if (str2Pos < str2Length-1) {
            return false;
        }

        // Print out the aligned strings.
        System.out.println(str1);
        System.out.println(aligned);

        // Return true to indicate that an alignment was found.
        return true;
    }
}
