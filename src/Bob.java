import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("What's up?");

        String messageToBob = scan.nextLine();
        boolean isAQuestion = messageToBob.endsWith("?");

        boolean yelling = messageToBob.endsWith("!");

        if (isAQuestion) {
            System.out.println("Sure.");

        } else if (yelling) {
            System.out.println("Whoa, chill out!");

        } else if (messageToBob.equals("")) {
            System.out.println("Fine. Be that way!");

        } else {
            System.out.println("Whatever.");
        }
    }
}
