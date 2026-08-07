import java.util.Scanner;

public class ScannerDemo {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter byte value:");
            byte b = scan.nextByte();
            System.out.println("Byte value: " + b);
            
            System.out.println("Enter short value:");
            short c = scan.nextShort();
            System.out.println("Short value: " + c);

            System.out.println("Enter int value:");
            int d = scan.nextInt();
            System.out.println("Int value: " + d);

            System.out.println("Enter long value:");
            long e = scan.nextLong();
            System.out.println("Long value: " + e);

            System.out.println("Enter float value:");
            float f = scan.nextFloat();
            System.out.println("Float value: " + f);

            System.out.println("Enter double value:");
            double g = scan.nextDouble();
            System.out.println("Double value: " + g);

            System.out.println("Enter boolean value:");
            boolean h= scan.nextBoolean();
            System.out.println("Boolean value: " + h);

            System.out.println("Enter char value:");
            char i = scan.next().charAt(0);
            System.out.println("Char value: " + i);

            System.out.println("Enter string value:");
            String j = scan.next();
            System.out.println("String value: " + j);

            scan.close();

        }
        
}
