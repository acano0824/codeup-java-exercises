import java.util.Random;
public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"Soft", "Hard", "Wet", "Dry", "Cold", "Hot", "Spicy", "Sweet", "Strong", "Weak"};
        String[] nouns = {"John", "Sally", "Kevin", "Jack", "Dragon", "Lizard", "Squid", "Rabbit", "Dog", "Cat"};

        int rnd = new Random().nextInt(adjectives.length);
        int ran = new Random().nextInt(adjectives.length);

        System.out.println(adjectives[rnd] + " " + nouns[ran]);
    }

}
