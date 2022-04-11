package Task7;

public class NonFlyingBird extends Bird {


    public NonFlyingBird(String feather, String layEggs) {
        super(feather, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Can't fly.");

    }
}
