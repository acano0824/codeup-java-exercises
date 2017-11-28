package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        int onOff = 0;

        do {

            System.out.printf("What would you like to do?\n\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n\n" +
                    "Enter your choice: ");

            Input in = new Input();
            int userInput = in.getInt();
            MoviesArray movie = new MoviesArray();
            Movie[] movies = movie.findAll();

            switch (userInput) {
                case 0:
                    onOff = 2;
                    System.out.println("Thank you for using Movie App");
                    break;
                case 1:
                    for (int i = 0; i < movies.length; i++) {
                        System.out.println(movies[i].getName());
                    }
                    break;
                case 2:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "animated") {
                            System.out.println(movies[i].getName());
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "drama") {
                            System.out.println(movies[i].getName());
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "horror") {
                            System.out.println(movies[i].getName());
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "scifi") {
                            System.out.println(movies[i].getName());
                        }
                    }
                    break;
                default:
                    System.out.println("That's not an option.");
            }
        } while (onOff == 0);

    }

}
