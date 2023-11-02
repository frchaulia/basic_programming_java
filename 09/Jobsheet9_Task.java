import java.util.Scanner;

public class Jobsheet9_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // Task 1
        System.out.println("Task 1");
        System.out.println("Enter value X: ");
        int X = sc.nextInt();
        
        for (int i = 1; i <= X; i++) {
            for (int j = X - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\t");

        // Task 2 
        System.out.println("Task 2");
        System.out.print("Enter a value for N (minimum 3): ");
        int N = sc.nextInt();
        if (N < 3) {
            System.out.println("N must be at least 3.");
            return;
        }
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.print("\t");

        // Task 3
        System.out.println("Task 3");
        System.out.print("Enter the height of the pyramid (minimum 3): ");
        int height = sc.nextInt();
        if (height < 3) {
            System.out.println("The height must be at least 3.");
            return;
        }
        int numSpaces = height - 1;
        int numStars = 1;
        for (int r = 1; r <= height; r++) {
            for (int space = 1; space <= numSpaces; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= numStars; star++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces--;
            numStars += 2;
        }
        System.out.print("\t");
    }
}
