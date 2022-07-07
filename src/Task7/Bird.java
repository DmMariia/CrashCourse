package Task7;

public abstract class Bird {
    private String feather;
    private String layEggs;


    public String getFeather() {
        return feather;
    }

    public void setFeather(String feather) {
        this.feather = feather;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public Bird(String feather, String layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feather='" + feather + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    public abstract void fly();
}
