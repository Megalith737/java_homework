package com.game.core;

import com.game.players.ComputerPlayer;
import com.game.players.HumanPlayer;
import com.game.players.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialSticks = 20;
        int maxMovePerTurn = 3;

        System.out.println("=== ВІТАЮ У ГРІ 'ПАЛИЧКИ' ===");
        System.out.println("Оберіть режим гри:");
        System.out.println("1. Людина проти Людини");
        System.out.println("2. Людина проти Комп'ютера");
        System.out.print("Ваш вибір: ");

        int mode = getValidInput(scanner, 1, 2);

        Player p1 = new HumanPlayer("Гравець 1");
        Player p2;

        if (mode == 1) {
            p2 = new HumanPlayer("Гравець 2");
        } else {
            System.out.println("\nОберіть складність AI:");
            System.out.println("1. Легкий (Рандом)");
            System.out.println("2. Складний (Непереможний)");
            System.out.print("Ваш вибір: ");
            int difficulty = getValidInput(scanner, 1, 2);

            p2 = new ComputerPlayer(difficulty == 2);
        }

        GameEngine game = new GameEngine(initialSticks, maxMovePerTurn, p1, p2);
        game.start();
    }

    // Helper-метод для валідації вибору меню (DRY - Don't Repeat Yourself)
    private static int getValidInput(Scanner scanner, int min, int max) {
        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            } else {
                scanner.next(); // очистка буфера
            }
            System.out.print("Невірний ввід. Спробуйте ще раз: ");
        }
    }
}