public class Lesson {
    private String classCode;
    private String subjectName;
    private String time;

    public Lesson(String classCode, String subjectName, String time) {
        this.classCode = classCode;
        this.subjectName = subjectName;
        this.time = time;
    }

    public String getClassCode() {
        return classCode;
    }

    @Override
    public String toString() {
        return "Код: " + classCode +
                " | Предмет: " + subjectName +
                " | Час: " + time;
    }
}