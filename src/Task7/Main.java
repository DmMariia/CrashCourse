package Task7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bird = new ArrayList<>();
        bird.add("dove");
        bird.add("ostrich");
        Bird dove = new Bird("Grey", "White") {
            @Override
            public void fly() {
                System.out.println("Can fly.");

            }
        };
        dove.fly();

        Bird ostrich = new Bird("Black", "White") {
            @Override
            public void fly() {
                System.out.println("Can't fly.");
            }
        };
        ostrich.fly();


        Eagle eagle = new Eagle("Brown", "White");
        eagle.fly();
        Swallow swallow = new Swallow("Blue", "White");
        swallow.fly();
        Penguin penguin = new Penguin("Black", "White");
        penguin.fly();
        Chicken chicken = new Chicken("White", "White");
        chicken.fly();
    }
}
