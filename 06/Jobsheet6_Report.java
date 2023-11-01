import java.util.Scanner;

public class SelectionTasks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        System.out.println("===== Task 1 =====");
        double number1, number2, result;
        char operator;
        System.out.print("Enter your first number: ");
        number1 = sc.nextDouble();
        System.out.print("Enter your second number: ");
        number2 = sc.nextDouble();
        System.out.print("Enter your operator (+ - * /): ");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Wrong operator!");
        }
        System.out.println("\t");

        // Task 2
        System.out.println("===== Task 2 =====");
        float sideA, sideB, sideC;
        System.out.print("Enter the first number: ");
        sideA = sc.nextFloat();
        System.out.print("Enter the second number: ");
        sideB = sc.nextFloat();
        System.out.print("Enter the third number: ");
        sideC = sc.nextFloat();
        if (sideA == sideB && sideA == sideC) {
            System.out.println("Triangle equilateral");
        } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
            System.out.println("Triangle isosceles");
        } else {
            System.out.println("Triangle arbitrary");
        }
        System.out.println("\t");

        // Task 3
        System.out.println("===== Task 3 =====");
        String foodN;
        int foodP, total, express;
        System.out.print("Enter the food name: ");
        sc.nextLine();
        foodN = sc.nextLine();
        System.out.print("Enter the food price: IDR ");
        foodP = sc.nextInt();
        System.out.print("Do you want express delivery (0 = no, 1 = yes)? ");
        express = sc.nextInt();
        switch (express) {
            case 0:
                total = foodP + 30000;
                System.out.println("RECEIPT");
                System.out.println(foodN + " IDR " + foodP);
                System.out.println("Shipping fee IDR 30000");
                System.out.println("TOTAL IDR " + total);
                break;
            case 1:
                total = foodP + 55000;
                System.out.println("RECEIPT");
                System.out.println(foodN + " IDR " + foodP);
                System.out.println("Shipping fee IDR 55000");
                System.out.println("TOTAL IDR " + total);
                break;
        }
        System.out.println("\t");

        // Task 4
        System.out.println("===== Task 4 =====");
        int age;
        String workStatus, schoolStatus;
        System.out.print("How old are you? ");
        age = sc.nextInt();
        if (age >= 18) {
            sc.nextLine();
            System.out.print("Have you worked? (yes or no): ");
            workStatus = sc.nextLine();
            if (workStatus.equalsIgnoreCase("yes")) {
                System.out.print("Enter the monthly income: ");
                double monthIn = sc.nextDouble();
                System.out.print("Enter the number of dependents: ");
                double numDependent = sc.nextDouble();
                double costL = monthIn / numDependent;
                System.out.println("Cost of Living: " + costL);
                if (costL <= 300000) {
                    System.out.println("Not Poor People");
                } else {
                    System.out.println("Poor People");
                }
            } else if (workStatus.equalsIgnoreCase("no")) {
                System.out.println("Poor People");
            } else {
                System.out.println("Wrong Input!");
            }
        } else {
            sc.nextLine();
            System.out.print("Are you a student? (yes or no): ");
            schoolStatus = sc.nextLine();
            if (schoolStatus.equalsIgnoreCase("yes")) {
                System.out.println("Not Poor People");
            } else if (schoolStatus.equalsIgnoreCase("no")) {
                System.out.println("Poor People");
            } else {
                System.out.println("Wrong Input!");
            }
        }
    }
}
