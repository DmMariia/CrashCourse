package Task7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Eagle("Brown", "Yes"));
        birds.add(new Swallow("Blue", "Yes"));
        birds.add(new Penguin("Black", "Yes"));
        birds.add(new Chicken("White", "Yes"));

        for (Bird iterator : birds) {
            System.out.println(iterator.toString());
            iterator.fly();
        }
    }
}
