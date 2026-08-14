class StudentThis {
    String name;
    int id;
    double height;

    void input(String name, int id, double height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(height);
    }
}
public class This {
    public static void main(String[] args) {
        StudentThis s1=new StudentThis();
        s1.input("Haseena", 1, 5.2);
        s1.display();
    }
}