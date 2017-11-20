import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("What's up?");

        String askBob = scan.nextLine();
        boolean isAQuestion = askBob.endsWith("?");

        String yellAtBob = scan.nextLine();
        boolean yelling = yellAtBob.endsWith("!");

        String sayNothing = scan.nextLine();
        boolean nothing = sayNothing.startsWith(" ");


        if (isAQuestion) {
            System.out.println("Sure.");

        } else if (yelling) {
            System.out.println("Whoa, chill out!");

        } else if (nothing) {
            System.out.println("Fine. Be that way!");

        } else {
            System.out.println("Whatever.");
        }
    }
}
