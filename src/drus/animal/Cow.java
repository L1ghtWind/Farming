package drus.animal;

public class Cow extends Animal {
    private String name = "Коровка";

    public Cow(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "2-Cow{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}