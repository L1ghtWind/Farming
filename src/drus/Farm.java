package drus;

import java.util.Scanner;

public class Farm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu currentMenu = new MainMenu();
        currentMenu.processInput(scanner);
    }
}