class Printer {
    // Overloaded method accepting an integer
    void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    // Overloaded method accepting a char array
    void print(char[] arr) {
        System.out.print("Printing char array: ");
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Overloaded method accepting a String
    void print(String str) {
        System.out.println("Printing string: " + str);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Printer p = new Printer();

        // 1. Calling print with an int
        p.print(100);

        // 2. Calling print with a char array
        char[] letters = {'J', 'a', 'v', 'a'};
        p.print(letters);

        // 3. Calling print with a String
        p.print("Hello World");
    }
}
