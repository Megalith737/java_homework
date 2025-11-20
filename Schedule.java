import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private Map<String, Lesson> classes = new HashMap<>();

    public void addClass(Lesson lesson) {
        classes.put(lesson.getClassCode(), lesson);
    }

    public void removeClass(String classCode) {
        if (classes.containsKey(classCode)) {
            classes.remove(classCode);
            System.out.println("Заняття з кодом " + classCode + " видалено.");
        } else {
            System.out.println("Помилка: Заняття з кодом " + classCode + " не знайдено.");
        }
    }

    public Lesson findClass(String classCode) {
        return classes.get(classCode);
    }

    public void printAllClasses() {
        if (classes.isEmpty()) {
            System.out.println("Розклад порожній.");
            return;
        }
        for (Lesson lesson : classes.values()) {
            System.out.println(lesson);
        }
    }
}