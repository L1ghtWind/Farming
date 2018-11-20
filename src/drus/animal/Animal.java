package drus.animal;

public abstract class Animal {
    private int id;
    private int happiness=50;
    private int satiety=50;
    private int purity=50;
    private int a = 0;
    private int b = 10;
    private int c = 5;
    private int random_number1 = a + (int)(Math.random() * b);
    private int random_number2 = a + (int)(Math.random() * c);

    public Animal(int id) {
        this.id = id;
    }

    public void chosenAnimalHappinessRule() {
        setHappiness(getHappiness()+random_number1);
        setPurity(getPurity()-random_number2);
        setSatiety(getSatiety()-random_number2 );
    }
    public void chosenAnimalPurityRule() {
        setHappiness(getHappiness()-random_number2);
        setPurity(getPurity()+random_number1);
        setSatiety(getSatiety()-random_number2);
    }
    public void chosenAnimalSatietyRule() {
        setHappiness(getHappiness()-random_number2);
        setPurity(getPurity()-random_number2);
        setSatiety(getSatiety()+random_number1);
    }
    public void otherAnimalRule() {
        setHappiness(getHappiness()-random_number2);
        setPurity(getPurity()-random_number2);
        setSatiety(getSatiety()-random_number2);
    }

    public int getId() {
        return id;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getPurity() {
        return purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }

    @Override
    public String toString() {
        return "State{" +
                "happiness=" + happiness +
                ", satiety=" + satiety +
                ", purity=" + purity +
                '}';
    }
}
