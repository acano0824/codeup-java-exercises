package grades;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        ArrayList<Integer> grade1 = new ArrayList<>(Arrays.asList(90, 80, 70));
        students.put("acano0824", new Student("ashley", grade1));

        ArrayList<Integer> grade2 = new ArrayList<>(Arrays.asList(70, 85, 10));
        students.put("tere88", new Student("terrell", grade2));

        ArrayList<Integer> grade3 = new ArrayList<>(Arrays.asList(50, 65, 88));
        students.put("eme99", new Student("emmett", grade3));

        ArrayList<Integer> grade4 = new ArrayList<>(Arrays.asList(99, 67, 99));
        students.put("coco34", new Student("coco", grade4));

        int onOff = 0;

        do {

            System.out.println("Welcome!\n\n" +
                    "Here are the github usernames of our students:\n\n" +
                    "|acano0824| |tere88| |eme99| |coco34|\n\n" +
                    "What student would you like to see more information on? \n");

            Input input = new Input();

            String userResponse = input.getString();

            switch (userResponse) {
                case "acano0824":
                    System.out.println("Name: " + students.get(userResponse).getNames() + " - Github Username: " + userResponse);
                    System.out.println("Current Grades: " + students.get(userResponse).printGrades());
                    System.out.println("Current Average: " + students.get(userResponse).getGradeAverage() + "\n\n");
                    break;
                case "tere88":
                    System.out.println("Name: " + students.get(userResponse).getNames() + " - Github Username: " + userResponse);
                    System.out.println("Current Grades: " + students.get(userResponse).printGrades());
                    System.out.println("Current Average: " + students.get(userResponse).getGradeAverage() + "\n\n");
                    break;
                case "eme99":
                    System.out.println("Name: " + students.get(userResponse).getNames() + " - Github Username: " + userResponse);
                    System.out.println("Current Grades: " + students.get(userResponse).printGrades());
                    System.out.println("Current Average: " + students.get(userResponse).getGradeAverage() + "\n\n");
                    break;
                case "coco34":
                    System.out.println("Name: " + students.get(userResponse).getNames() + " - Github Username: " + userResponse);
                    System.out.println("Current Grades: " + students.get(userResponse).printGrades());
                    System.out.println("Current Average: " + students.get(userResponse).getGradeAverage() + "\n\n");
                    break;
                default:
                    System.out.println("Sorry, no student found with the github username of \"" + userResponse + "\".");
            }

            System.out.println("Would you like to see another student?");
            Input input1 = new Input();
            String userInput = input1.getString();

            if (userInput.equalsIgnoreCase("no")) {
                onOff = 4;
                System.out.println("Goodbye, and have a wonderful day!");
            } else {
                onOff = 0;
            }


        } while (onOff == 0);

    }

}
