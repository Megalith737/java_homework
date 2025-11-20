package com.game.core;

import com.game.players.HumanPlayer;
import com.game.players.Player;

public class Main {

    public static void main(String[] args) {
        // 1. Конфігурація (Налаштування)
        int initialSticks = 20;
        int maxMovePerTurn = 3;

        // 2. Створення об'єктів (Гравці)
        Player p1 = new HumanPlayer("Іван");
        Player p2 = new HumanPlayer("Марія");

        // 3. Ініціалізація двигуна (Dependency Injection)
        GameEngine game = new GameEngine(initialSticks, maxMovePerTurn, p1, p2);

        // 4. Старт
        game.start();
    }
}