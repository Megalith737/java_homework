package com.game.players;

public interface Player {
    // Метод, щоб зробити хід. Повертає кількість взятих паличок.
    int makeMove(int currentSticks, int maxMove);

    // Отримати ім'я гравця
    String getName();
}