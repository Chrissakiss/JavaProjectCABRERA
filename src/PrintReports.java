import school.*;
import util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrintReports {

    public static void main(String[] args) throws IOException {
        BufferedReader ask = new BufferedReader(new InputStreamReader(System.in));
        String str = ask.readLine();
        new PrintReports();
        Classroom room = null;
        ArrayList<Displayable> d = new ArrayList<Displayable>();
        int roomNumber = 0;
        Teacher prof = null;
        Student kid = null;
    }

    public PrintReports() throws IOException {
        ArrayList<Displayable> d = new ArrayList<Displayable>();
        BufferedReader ask = new BufferedReader(new InputStreamReader(System.in));
        String str = ask.readLine();
        do {
            util.Displayable room = enterClassroom();
            d.add(room);
            System.out.println("Enter another Classroom? (Y/N: ");
        } while (str.equalsIgnoreCase("Y"));
    }

    public Displayable enterClassroom() throws IOException {
        int roomNumber;
        ArrayList<Displayable> d = new ArrayList<Displayable>();
        BufferedReader ask = new BufferedReader(new InputStreamReader(System.in));
        String str = ask.readLine();

        do {
            roomNumber = KeyboardReader.getPromptedInt("Enter room number: ",
                    "Invalid format", new RoomValidator(),
                    "Valid room numbers are integers >= 100");
            if (roomNumber < 100) ;
        } while (roomNumber < 100);

        util.Displayable prof = enterTeacher();
        d.add(prof);

        do {
            Displayable coed = enterStudent();
            d.add(coed);
            System.out.println("Enter another Student? (Y/N: ");
        } while (str.equalsIgnoreCase("Y"));




    }
    public Displayable enterTeacher();

    public Displayable enterStudent() {
        ArrayList<Displayable> d = new ArrayList<Displayable>();

        String fName = null;
        String lName = null;
        int studentId = 0;
        int finalGrade = 0;

        fName = KeyboardReader.getPromptedString("Enter Student first name: ");
        lName = KeyboardReader.getPromptedString("Enter Student last name: ");
        do {
            studentId = KeyboardReader.getPromptedInt("Enter Student ID: ",
                    "Invalid format", new IdValidator(),
                    "A student's ID must be greater than 0");
            if (studentId <= 0);
        } while (studentId <= 0);
        do {
            finalGrade = KeyboardReader.getPromptedInt("Enter Student final grade: ",
                    "Invalid format", new IdValidator(),
                    "A student's final grade must be an integer between 0 and 100");
            if (finalGrade < 0 || finalGrade > 100);
        } while (finalGrade < 0 || finalGrade > 100);
        Student pupil = new Student(fName, lName, studentId, finalGrade);

        util.Displayable scholar = pupil.display();
        return scholar;
    }

    void report(ArrayList<Displayable>);
}
