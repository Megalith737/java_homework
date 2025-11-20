public class Main {
    public static void main(String[] args) {
        Schedule mySchedule = new Schedule();

        Lesson math = new Lesson("M101", "Вища Математика", "08:30");
        Lesson history = new Lesson("H202", "Історія України", "10:15");
        Lesson programming = new Lesson("CS50", "Java Programming", "12:00");

        mySchedule.addClass(math);
        mySchedule.addClass(history);
        mySchedule.addClass(programming);

        System.out.println("=== Мій Розклад Занять ===");
        mySchedule.printAllClasses();

        System.out.println("\n=== Пошук заняття CS50 ===");
        Lesson foundLesson = mySchedule.findClass("CS50");
        if (foundLesson != null) {
            System.out.println("Знайдено: " + foundLesson);
        } else {
            System.out.println("Заняття не знайдено.");
        }

        System.out.println("\n=== Видалення заняття H202 ===");
        mySchedule.removeClass("H202");

        System.out.println("\n=== Розклад після оновлення ===");
        mySchedule.printAllClasses();
    }
}