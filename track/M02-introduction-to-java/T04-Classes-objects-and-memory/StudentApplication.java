class StudentApp {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

 
public class StudentApplication {

    public static void main(String[] args) {

        StudentApp s1 = new StudentApp();

        s1.roll = 1;
        s1.name = "Hassan";
        s1.height = 5.9;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.run();
        s1.sleep();
    }
}
