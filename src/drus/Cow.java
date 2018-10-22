package drus;

public class Cow extends Animal {
    private String name = "Коровка";

    @Override
    public String toString() {
        return "2-Cow{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}