package com.game.core;

import com.game.players.Player;

public class GameEngine {
    private int totalSticks;
    private final int maxMove;
    private final Player player1;
    private final Player player2;

    // Конструктор ініціалізує гру
    public GameEngine(int initialSticks, int maxMove, Player p1, Player p2) {
        this.totalSticks = initialSticks;
        this.maxMove = maxMove;
        this.player1 = p1;
        this.player2 = p2;
    }

    public void start() {
        System.out.println("🎮 ГРА ПОЧАЛАСЯ! Паличок: " + totalSticks);

        Player currentPlayer = player1;

        while (totalSticks > 0) {
            System.out.println("\n--- Паличок у купі: " + totalSticks + " ---");

            // Поліморфізм в дії: нам байдуже, це людина чи комп'ютер
            int sticksTaken = currentPlayer.makeMove(totalSticks, maxMove);
            totalSticks -= sticksTaken;

            if (totalSticks == 0) {
                // Той, хто взяв останню - програв.
                System.out.println("\n💀 " + currentPlayer.getName() + " взяв останню паличку і ПРОГРАВ!");
                break;
            }

            // Зміна ходу
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        System.out.println("🏆 Кінець гри.");
    }
}