import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TestStudent {

    public static void main(String[] args) throws FileNotFoundException {
        Student[] students = Student.readStudentsFromFile("myfile.txt");
        Student.sort(students);
    }
}