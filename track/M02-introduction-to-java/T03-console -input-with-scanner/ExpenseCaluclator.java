import java.util.Scanner;

public class ExpenseCaluclator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double monthlyIncome = scan.nextDouble();
        double rentExpense = scan.nextDouble();
        double foodExpense = scan.nextDouble();
        double travelExpense = scan.nextDouble();
        
        double totalExpense = rentExpense + foodExpense + travelExpense;
        
        double remaining = monthlyIncome - totalExpense;
        
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Remaining Balance: " + remaining);

        if (remaining >=0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        scan.close();
    }
}
