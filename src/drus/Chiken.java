package drus;

public class Chiken extends Animal {
    private String name = "Курица";

    @Override
    public String toString() {
        return "1-Chiken{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}