package drus.menu;

import drus.animal.Animals;

import java.util.Scanner;

/**
 * Главное меню.
 * 1- Создание новой игры
 * 2- Продолженние игры
 * 3- Выход из игры
 */

public class MainMenu implements Menu {


    @Override
    public void processInput(Scanner scanner) {
        System.out.println("Press 1 to start new game");
       //System.out.println("Press 2 to continue progress");
        System.out.println("Press 3 to exit");
        int x = scanner.nextInt();
        if (x == 1) {
            Animals animals = new Animals();
            new AnimalSelectionMenu(animals).processInput(scanner);
        } else if (x == 3) {

        } else {
            this.processInput(scanner);
        }
    }
}
