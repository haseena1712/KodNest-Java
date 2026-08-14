public class ConstructorOverloading {
        String name;
        int age;
        double height;
        
        ConstructorOverloading()
        {
            name = "hemu";
            age = 22;
            height = 4.5;
        }
        ConstructorOverloading(String name)
        {
           this.name = name;
        }
        ConstructorOverloading(String name, int age, double height)
        { 
            this.name = name;
            this.age = age;
            this.height = height;

        }
        void display()
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println(height);
        }
        public static void main(String[] args) {
            ConstructorOverloading c1 = new ConstructorOverloading();
            c1.display();
            ConstructorOverloading c2 = new ConstructorOverloading("Haseena");
            c2.display();
            ConstructorOverloading c3 = new ConstructorOverloading("Haseena",19,5.1);
            c3.display();            
        }
        
}
