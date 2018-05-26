import java.util.Scanner;
import java.util.ArrayList;

/*
Implement class Student that holds the following information about a student:

name (String)
studentNumber (String)
The class should have the following methods:

A constructor that initializes the name and the student number with the given parameters.
getName, that returns the student name
getStudentNumber, that returns the student number
toString, that returns a String representation of the form: Pekka Mikkola (013141590)
 */

public class Student
{
    private String name;
    private String studentNumber;

    public Student(String name, String studentNumber)
    {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public String toString()
    {
        return name + " (" + studentNumber + ")";
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        String name, studentNumber;

        System.out.print("name: ");
        name = scanner.nextLine();

        while (!name.isEmpty())
        {
            System.out.print("studentnumber: ");
            studentNumber = scanner.nextLine();

            students.add(new Student(name, studentNumber));

            System.out.print("name: ");
            name = scanner.nextLine();
        }

        for (Student s : students)
        {
            System.out.println(s);
        }

        System.out.print("Give search term: ");
        String searchTerm = scanner.nextLine();

        System.out.println("Result:");
        for (Student s : students)
        {
            if (s.getName().contains(searchTerm))
                System.out.println(s);
        }

//        Student pekka = new Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println(pekka);
    }
}