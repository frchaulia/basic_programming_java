import java.util.Scanner;

public class Jobsheet5_Experiment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Experiment 1
        System.out.println("===== Experiment 1 =====");
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        String output = (number % 2 == 0) ? "So, the " + number + " is Even Number" : "Odd Number";
        System.out.println(output);
        System.out.println("\t");

        // Experiment 2
        System.out.println("===== Experiment 2 =====");
        int score;
        System.out.print("Enter the score: ");
        score = input.nextInt();
        if (score >= 100) {
            score += 10;
        } else {
            score -= 10;
        }
        System.out.println("Final result of the score is " + score);
        System.out.println("\t");

        // Question Experiment 2
        System.out.println("===== Quest Exp 2 =====");
        System.out.print("Enter the first value: ");
        double value1 = input.nextDouble();
        System.out.print("Enter the second value: ");
        double value2 = input.nextDouble();
        double average = (value1 + value2) / 2;
        if (average >= 100) {
            average -= 5;
        } else {
            System.out.println("Value is less than 100.");
        }
        System.out.println("The final result of the average is " + average);
        System.out.println("\t");

        // Experiment 3
        System.out.println("===== Experiment 3 =====");
        int age;
        System.out.print("Please enter your age: ");
        age = input.nextInt();
        if (age > 60) {
            System.out.println("You are elderly");
        } else if (age > 45) {
            System.out.println("You are old");
        } else if (age > 17) {
            System.out.println("You are mature");
        } else if (age > 5) {
            System.out.println("You are children");
        } else {
            System.out.println("You are toddler");
        }
        System.out.println("\t");
        
        // Experiment 4
        System.out.println("===== Experiment 4 =====");
        double number1, number2, result;
        char operator;
        System.out.print("Enter your first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter your second number: ");
        number2 = input.nextDouble();
        System.out.print("Enter your operator (+ - * /): ");
        operator = input.next().charAt(0);
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
    }
}
