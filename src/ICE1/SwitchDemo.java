package ICE1;

public class SwitchDemo {
    public static void main(String[] args) {
        // array of the words first to twelfth
        String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String lyrics = "";
        // switch case of day

        for (String day: days) {
            switch (day){
                case "first":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "A partridge in a pear tree\n";
                    System.out.println(lyrics);
                    break;

                case "second":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Two turtledoves\n";
                    System.out.println(lyrics);
                    break;

                case "third":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Three French hens\n";
                    System.out.println(lyrics);
                    break;
                case "fourth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Four Calling Birds\n";
                    System.out.println(lyrics);
                    break;
                case "fifth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Five Gold Rings\n";
                    System.out.println(lyrics);
                    break;
                case "sixth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Six Geese a-layin\n";
                    System.out.println(lyrics);
                    break;
                case "seventh":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Seven swans a swimming\n";
                    System.out.println(lyrics);
                    break;
                case "eighth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Eight maids a milking\n";
                    System.out.println(lyrics);
                    break;
                case "ninth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Nine ladies dancing\n";
                    System.out.println(lyrics);
                    break;
                case "tenth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Ten lords a leapin\n";
                    System.out.println(lyrics);
                    break;
                case "eleventh":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "eleven pipers piping\n";
                    System.out.println(lyrics);
                    break;
                case "twelfth":
                    System.out.println("On the " + day + " day of Christmas my true love sent to me");
                    lyrics += "Twelve drummers drumming\n";
                    System.out.println(lyrics);
                    break;
            }
        }
    }
}
