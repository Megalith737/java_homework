package com.game.players;

import java.util.Random;

public class ComputerPlayer implements Player {
    private final String name;
    private final boolean isHardMode;
    private final Random random;

    public ComputerPlayer(boolean isHardMode) {
        this.isHardMode = isHardMode;
        this.name = isHardMode ? "AI (Terminator 🤖)" : "AI (Junior 👶)";
        this.random = new Random();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int makeMove(int currentSticks, int maxMove) {
        int move;
        if (isHardMode) {
            move = getBestMove(currentSticks, maxMove);
        } else {
            move = getRandomMove(currentSticks, maxMove);
        }

        System.out.println(" бере " + move);
        return move;
    }

    //логіка рандом
    private int getRandomMove(int currentSticks, int maxMove) {
        int effectiveMax = Math.min(currentSticks, maxMove);
        return random.nextInt(effectiveMax) + 1;
    }

    //намагаємось залишити кількість паличок = 1 + K * (maxMove + 1)
    private int getBestMove(int currentSticks, int maxMove) {
        int targetRemainder = 1;

        // Формула виграшного ходу
        int optimalMove = (currentSticks - targetRemainder) % (maxMove + 1);

        // Якщо optimalMove == 0, це означає, що ми вже у програшній позиції
        // Тому просто робимо рандомний хід або беремо 1.
        if (optimalMove == 0) {
            optimalMove = getRandomMove(currentSticks, maxMove);
        }

        // Хоча математика вище зазвичай дає правильний результат, це захист.
        int effectiveMax = Math.min(currentSticks, maxMove);
        if (optimalMove > effectiveMax || optimalMove < 1) {
            optimalMove = 1;
        }

        return optimalMove;
    }
}