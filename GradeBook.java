import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GradeBook {
    HashMap<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(String id) {
        students.remove(id);
    }

    public Student findStudent(String id) {
        return students.get(id);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Немає студентів у базі.");
            return;
        }
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }
}