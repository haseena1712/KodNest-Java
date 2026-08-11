class Employee {
    int id;
    String name;
  
    void work(){
        System.out.println("Working");
    }
}
public class EmployeeApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = 69;
        e1.name = "banu";
        System.out.println(e1.id);
        System.out.println(e1.name);

        e1.work();

        Employee e2;
        e2=e1;
        e2.id = 13;
        e2.name = "hemu";

        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);

        e2.work();
    }
}