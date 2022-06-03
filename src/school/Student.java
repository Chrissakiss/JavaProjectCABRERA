package school;
import util.Displayable;

public class Student extends Person implements Displayable {
    private static int nextId = 1;
    public int studentId = nextId++;
    private int finalGrade;

    public Student() {
    }
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Student(String firstName, String lastName, int studentId, int finalGrade) {
        super(firstName, lastName);
        this.studentId = getStudentId();
        setFinalGrade(finalGrade);
    }


    public static int getNextId() {
        return nextId;
    }
    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }
    public int getStudentId() { return studentId; }

    public int getFinalGrade() { return finalGrade; }
    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Displayable display() {
        return "Student ID: " + studentId + "  " + getFullName() +
                " Final Grade: " + finalGrade;
    }
    public String display(String firstName, String lastName, int studentId, int finalGrade) {
        return "First Name: " + firstName + " Last Name: " + lastName +
                " Student ID: " + studentId +
                " Final Grade: " + finalGrade;
    }
}
