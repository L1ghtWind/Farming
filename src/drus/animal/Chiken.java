package drus.animal;

public class Chiken extends Animal {
    private String name = "Курица";

    public Chiken(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "1-Chiken{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}