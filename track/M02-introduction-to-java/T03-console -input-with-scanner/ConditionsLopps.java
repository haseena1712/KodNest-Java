import java.util.Scanner;

public class ConditionsLopps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = scan.nextInt();
        int total = 0;

        for (int i = 1 ; i <=days ; i++) {
            total += scan.nextInt();
            }

            System.out.println("Total solved: " + total);

            if (total >=20) {
                 System.out.println("Status: StrongProgress");
            }
            else if (total >=10){
                System.out.println("Status: KeepGoing");
            }
            else{
                System.out.println("Status: Need improvement");
            }

            scan.close();
    }
    
}
