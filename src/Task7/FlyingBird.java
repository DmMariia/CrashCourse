package Task7;

public class FlyingBird extends Bird {


    public FlyingBird(String feather, String layEggs) {
        super(feather, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Can fly.");
    }

}
