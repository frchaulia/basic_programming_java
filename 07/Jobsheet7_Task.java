import java.util.Scanner;

public class Jobsheet7_Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1
        System.out.println("Task 1");
        double avg;
        int number, evenNumber, totalEven = 0;
        int i = 0;
        System.out.print("Enter a number :");
        number = input.nextInt();
        evenNumber = number / 2;
        System.out.printf("The even numbers from 1-%d is %d \n", number,evenNumber);
        System.out.print("Even number on the range : ");
        do {
            i++;
            if (i % 2 == 0) {
                totalEven += i;
                if (i == number) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            } else {
                continue;
            }
        } while (i < number);
        avg = (double) totalEven / evenNumber;
        System.out.printf("\n Even Total %d \n Average %.1f", totalEven, avg);
        System.out.println("\t");

        // Task 2
        System.out.println("Task 2");
        System.out.println("Enter a number: ");
        int numb = input.nextInt();

        for (int a = 1; a <= numb; a++) {
            if (a % 5 == 0) {
                continue;
            }
            System.out.println(a);
        }
        System.out.println("\t");

        // Task 3
        System.out.println("Task 3");
        int count = 12, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of " + count + " numbers: ");
        int z = 1;
        while (z <= count) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            z++;
        }
        System.out.println("\t");
    }
}
