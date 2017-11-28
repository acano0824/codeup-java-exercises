package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


    }

    private Scanner scanner;

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
       String userChoice = scanner.next();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Not an integer!");
            scanner.next();
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput >= min && userInput <=max) {

        } else {
            System.out.println("Not in Range!");
            return getInt(min, max);
        }
    }

    public double getDouble(double min, double max) {


    }

    public double getDouble() {

    }
}
