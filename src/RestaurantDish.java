public class RestaurantDish {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 3000;
        dish.nameOfDish = "Pasta";
        dish.wouldRecommend = true;
        dish.eat();
    }

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;
    public void eat() {
        System.out.println("Nom nom nom!");
    }

}
