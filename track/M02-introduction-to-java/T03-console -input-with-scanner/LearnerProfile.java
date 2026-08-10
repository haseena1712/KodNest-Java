import java.util.Scanner;
public class LearnerProfile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        
        System.out.println("Enter the firstName");
        String firstName = scan.next();

         System.out.println("enter the Problem solved");
        int solvedProblems = scan.nextInt();

        System.out.println("enter the Assesment Percentage");
        double assesmentPercentage = scan.nextDouble();

    
        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assesment percentage: " + assesmentPercentage);

        scan.close();
    }
}
