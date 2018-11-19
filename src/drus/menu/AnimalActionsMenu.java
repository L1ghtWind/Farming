package drus.menu;

        import drus.animal.Animal;
        import drus.animal.Animals;
        import java.util.ArrayList;
        import java.util.Scanner;

public class AnimalActionsMenu implements Menu {
    private int id;
    private Animals animals;
    private AnimalSelectionMenu animalSelectionMenu;

    public AnimalActionsMenu(int id, Animals animals, AnimalSelectionMenu animalSelectionMenu) {
        this.id = id;
        this.animals = animals;
        this.animalSelectionMenu = animalSelectionMenu;
    }

    @Override
    public void processInput(Scanner scanner) {
        System.out.println("Выберите действия с Курицей");
        System.out.println("1-Поиграть");
        System.out.println("2-Покормить");
        System.out.println("3-Помыть");
        System.out.println("4-Вернуться на Выбор животных");
        int c = scanner.nextInt();
        if (c == 1) {
            System.out.println("Поиграли");
            Animal animalByID = animals.findAnimalByID(id);
            animalByID.chosenAnimalHappinessRule();
            ArrayList<Animal> anotherAnimalByID = animals.findAnotherAnimalByID(id);
            anotherAnimalByID.forEach(Animal::otherAnimalRule);
            System.out.println(animalByID);
            System.out.println(anotherAnimalByID);
            new AnimalSelectionMenu(animals).processInput(scanner);
        } else if (c == 2) {
            System.out.println("Покормили");
            Animal animalByID = animals.findAnimalByID(id);
            animalByID.chosenAnimalSatietyRule();
            ArrayList<Animal> anotherAnimalByID = animals.findAnotherAnimalByID(id);
            anotherAnimalByID.forEach(Animal::otherAnimalRule);
            System.out.println(animalByID);
            System.out.println(anotherAnimalByID);
            new AnimalSelectionMenu(animals).processInput(scanner);
        } else if (c == 3) {
            System.out.println("Помыли");
            Animal animalByID = animals.findAnimalByID(id);
            animalByID.chosenAnimalPurityRule();
            ArrayList<Animal> anotherAnimalByID = animals.findAnotherAnimalByID(id);
            anotherAnimalByID.forEach(Animal::otherAnimalRule);
            System.out.println(animalByID);
            System.out.println(anotherAnimalByID);
            new AnimalSelectionMenu(animals).processInput(scanner);
        } else if (c == 4) {
            new AnimalSelectionMenu(animals).processInput(scanner);
        }
        else {
            this.processInput(scanner);
        }

    }
}
