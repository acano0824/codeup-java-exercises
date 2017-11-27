public class BurgerTools {
    public static void main(String[] args) {
        BurgerTools tools = new BurgerTools();
        tools.mostPopularTopping = "Cheese";
        tools.averageDaysBeforeExpiration = 3;
        tools.temperatureWhenCooked = 145;
        tools.grill();

    }

    public String mostPopularTopping;
    public int averageDaysBeforeExpiration;
    public int temperatureWhenCooked;
    public void grill() {
        System.out.println("Grilling burger!");
    }

}
