# Sticks: The Last Loser

Консольна логічна гра на Java. Доступні режими гри проти друга або проти комп'ютера (AI) з різними рівнями складності.

## 📜 Правила Гри
1.  Є купа з $N$ паличок.
2.  Гравці по черзі беруть від 1 до $M$ паличок.
3.  Гравець, який змушений взяти **останню** паличку, програє.

## 🎮 Режими Гри
1.  **PvP (Player vs Player):** Два гравці за одним комп'ютером.
2.  **PvE (Player vs Environment):** Гра проти штучного інтелекту.
    * *Easy Mode:* Комп'ютер ходить випадковим чином.
    * *Hard Mode:* Комп'ютер використовує математичний алгоритм для перемоги.

## 🛠 Технічні Деталі
* **Мова:** Java (JDK 17+)
* **Принципи:** SOLID, KISS, DRY.
* **Архітектура:** Використано патерн Strategy для поведінки гравців.

## 🏗 Архітектура (UML)

```mermaid
classDiagram
    class Main {
        +main(String[] args)
    }

    class GameEngine {
        -int totalSticks
        -Player player1
        -Player player2
        +start()
    }

    class Player {
        <<interface>>
        +makeMove(int sticks, int maxMove) int
        +getName() String
    }

    class HumanPlayer {
        +makeMove() int
    }
    
    class ComputerPlayer {
        -boolean isHardMode
        +makeMove() int
        -getBestMove() int
        -getRandomMove() int
    }

    Main --> GameEngine : creates
    GameEngine --> Player : uses
    Player <|.. HumanPlayer : implements
    Player <|.. ComputerPlayer : implements