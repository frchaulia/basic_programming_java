import java.util.Scanner;

public class Jobsheet5_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        System.out.println("Task 1");
        int number1, number2;
        System.out.print("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.print(number1 + " is more than " + number2);
        } else {
            System.out.print(number2 + " is more than " + number1);
        }
        System.out.println("\t");

        // Task 2
        System.out.println("Task 2");
        int age;
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if (age >= 17) {
            System.out.print("Allowed to drive");
        } else {
            System.out.print("Not allowed to drive");
        }
        System.out.println("\t");

        // Task 3
        System.out.println("Task 3");
        float examScore, uTSScore, assignmentScore, quizScore, finalGrade;
        System.out.print("Enter examination score: ");
        examScore = sc.nextFloat();
        System.out.print("Enter UTS score: ");
        uTSScore = sc.nextFloat();
        System.out.print("Enter assignment score: ");
        assignmentScore = sc.nextFloat();
        System.out.print("Enter quiz score: ");
        quizScore = sc.nextFloat();
        finalGrade = (examScore * 40 / 100) + (uTSScore * 30 / 100) + (assignmentScore * 20 / 100) + (quizScore * 10 / 100);
        System.out.println("Final grade: " + finalGrade); 
        if (finalGrade < 65) {
            System.out.println("Get remedial");
        } else {
            System.out.println("Not get remedial");
        }
        System.out.println("\t");

        // Task 4
        System.out.println("Task 4");
        int priceA, priceB, priceC, quantityA, quantityB, quantityC, total, totalA, totalB, totalC, discount;
        System.out.print("Enter the price of item A: ");
        priceA = sc.nextInt();
        System.out.print("Enter the quantity of item A: ");
        quantityA = sc.nextInt();
        System.out.print("Enter the price of item B: ");
        priceB = sc.nextInt();
        System.out.print("Enter the quantity of item B: ");
        quantityB = sc.nextInt();
        System.out.print("Enter the price of item C: ");
        priceC = sc.nextInt();
        System.out.print("Enter the quantity of item C: ");
        quantityC = sc.nextInt();
        totalA = priceA * quantityA;
        totalB = priceB * quantityB;
        totalC = priceC * quantityC;
        total = totalA + totalB + totalC;
        System.out.println("Total = " + total);
        if (total > 200000) {
            discount = total * 2 / 100;
        } else if (total > 500000) {
            discount = total * 5 / 100;
        } else if (total > 1000000) {
            discount = total * 10 / 100;
        } else {
            discount = 0;
        }
        System.out.println("Discount: " + discount);
        System.out.println("Total pay: " + (total - discount));
        System.out.println("\t");
    }
}
