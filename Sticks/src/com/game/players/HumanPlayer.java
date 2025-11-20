package com.game.players;

import java.util.Scanner;
import java.util.Random;

// Реалізація живої людини
public class HumanPlayer implements Player {
    private final String name;
    private final Scanner scanner;

    public HumanPlayer(String name) {
        this.name = name;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int makeMove(int currentSticks, int maxMove) {
        while (true) {
            // Визначаємо реальний ліміт (не можна взяти більше, ніж є, або більше M)
            int effectiveMax = Math.min(currentSticks, maxMove);

            System.out.printf("%s, скільки паличок береш (1-%d)? ", name, effectiveMax);

            // Захист від введення літер замість цифр
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Помилка: Введіть ціле число!");
                scanner.next(); // очистка буфера
                continue;
            }

            int sticksToTake = scanner.nextInt();

            // Валідація логіки гри
            if (sticksToTake < 1 || sticksToTake > effectiveMax) {
                System.out.println("❌ Помилка: Некоректна кількість паличок. Спробуй ще раз.");
            } else {
                return sticksToTake;
            }
        }
    }
}