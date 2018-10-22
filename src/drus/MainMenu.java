package drus;

import java.util.Scanner;

public class MainMenu implements Menu {


    @Override
    public void processInput(Scanner scanner) {
        System.out.println("Press 1 to start game");
        System.out.println("Press 2 to exit");
        int x = scanner.nextInt();
        if (x == 1) {
            new AnimalSelectionMenu().processInput(scanner);
        } else if (x == 2) {

        } else {
            this.processInput(scanner);
        }
    }
}
