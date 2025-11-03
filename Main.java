import java.util.*;

public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        // створюємо студентів одразу зі списком оцінок
        Student s1 = new Student("101", "Іван Петренко", new ArrayList<>(Arrays.asList(90, 85, 95)));
        Student s2 = new Student("102", "Олена Коваленко", new ArrayList<>(Arrays.asList(100, 88, 92)));

        gradeBook.addStudent(s1);
        gradeBook.addStudent(s2);

        System.out.println("=== Усі студенти ===");
        gradeBook.printAllStudents();

        System.out.println("\nПошук студента з ID = 101:");
        System.out.println(gradeBook.findStudent("101"));

        gradeBook.removeStudent("102");
        System.out.println("\nПісля видалення студента 102:");
        gradeBook.printAllStudents();
    }
}
