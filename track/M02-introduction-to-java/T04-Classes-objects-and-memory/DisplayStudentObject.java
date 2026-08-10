import java.util.Scanner;

class Display {
    int id;
    String name;
    String course;
    double javaScore;
}

public class DisplayStudentObject  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Display s = new Display();

       
        s.id = scanner.nextInt();
        s.name = scanner.next();
        s.course = scanner.next();
        s.javaScore = scanner.nextDouble();

        System.out.println("Student ID: " + s.id);
        System.out.println("Student Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaScore);

        scanner.close();
    }
}
    

