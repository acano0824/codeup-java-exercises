public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        long x = 2;
        do {
            System.out.println(x);
            x *= x;
        } while(x < 1000000L);
    }
}

