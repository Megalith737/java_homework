import java.util.ArrayList;

public class Student {
    String ID;
    String name;
    ArrayList<Integer> grades;

    public Student(String ID, String name,ArrayList<Integer> grades) {
        this.ID = ID;
        this.name = name;
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Ім'я: " + name + ", Оцінки: " + grades;
    }

    public String getId() { return ID; }
}
