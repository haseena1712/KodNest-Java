public class Constructor {
    String name;
    int age;
    double height;

    Constructor(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
    public class ConstructorMethod {
        public static void main(String[] args) {
            Constructor c1 = new Constructor("Haseena",19,5.1);
            c1.display();
        }
    }
}
