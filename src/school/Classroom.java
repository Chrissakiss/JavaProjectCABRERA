package school;
import util.Displayable;
import java.util.ArrayList;

public class Classroom implements Displayable {
    int roomNumber;
    Displayable teacher;
    ArrayList<Displayable> students;

    public Classroom() {
    }
    public Classroom(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }

    public Displayable enterClassroom() {
        return new Classroom(roomNumber);
    }

    public Displayable display() {
        return "Room Number: " + roomNumber;
    }
}
