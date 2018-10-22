package drus;

public abstract class Animal {
    private int happiness=50;
    private int satiety=50;
    private int purity=50;

    @Override
    public String toString() {
        return "State{" +
                "happiness=" + happiness +
                ", satiety=" + satiety +
                ", purity=" + purity +
                '}';
    }
}
