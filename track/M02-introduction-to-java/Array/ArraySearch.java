import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key to search:");
        int key = sc.nextInt();

        // Initialized ref variable to -1 to represent 'not found' initially
        int ref = -1;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                ref = i;
                break;
            }
        }

        if (ref != -1) {
            System.out.println("Key found at index: " + ref);
        } else {
            System.out.println("Key not found in array.");
        }

        sc.close();
    }
}
