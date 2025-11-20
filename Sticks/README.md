# Sticks: The Last Loser (Game)

Консольна гра на Java, де два гравці по черзі тягнуть палички. Програє той, хто забирає останню.

## 📜 Правила Гри
1.  **Початок:** Задається початкова кількість паличок $N$ та ліміт ходу $M$.
2.  **Хід:** Гравець обирає кількість паличок $K$, де $1 \le K \le M$.
3.  **Обмеження:** Не можна взяти більше паличок, ніж залишилось у купі.
4.  **Кінець:** Гравець, який бере останню паличку, програє.

## 🛠 Технічні Вимоги
* Java JDK 17+
* Дотримання принципів SOLID.
* Обробка помилок (невірний ввід, вихід за межі діапазону).

## 🏗 Архітектура (UML)

Гра побудована на модульному дизайні.

```mermaid
classDiagram
    class GameEngine {
        -int totalSticks
        -int maxMove
        -Player player1
        -Player player2
        +start()
        -isGameOver() boolean
    }

    class Player {
        <<interface>>
        +makeMove(int currentSticks, int maxMove) int
        +getName() String
    }

    class HumanPlayer {
        -String name
        -Scanner scanner
        +makeMove(int currentSticks, int maxMove) int
    }

    class ComputerPlayer {
        -String name
        +makeMove(int currentSticks, int maxMove) int
    }

    GameEngine --> Player : uses
    Player <|.. HumanPlayer : implements
    Player <|.. ComputerPlayer : implements