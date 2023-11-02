import java.util.Scanner;

public class DataProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temperature = new double[5][7];

        // Task 1: Collect temperature data for 5 cities
        for (int city = 0; city < temperature.length; city++) {
            double max = 0;
            for (int day = 0; day < temperature[0].length; day++) {
                System.out.print("Enter the temperature of city " + (city + 1) + " for day " + (day + 1) + " : ");
                temperature[city][day] = sc.nextDouble();
                if (temperature[city][day] > max) {
                    max = temperature[city][day];
                }
            }
            System.out.println("Highest temperature recorded from city " + (city + 1) + " for 7 days in a row: " + max);
            System.out.println();
        }

        // Task 2: Analyze student data
        int[][] data = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}};
        String[] name = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
        String student = "";
        double maxAge = 0;
        double average = 0;
        double minWeight = 100;
        double totalWeight = 0;
        for (int studentIndex = 0; studentIndex < data.length; studentIndex++) {
            totalWeight += data[studentIndex][2];
            if (data[studentIndex][0] > maxAge) {
                maxAge = data[studentIndex][0];
                student = name[studentIndex];
            }
            for (int attributeIndex = 1; attributeIndex < data[0].length; attributeIndex++) {
                if (data[studentIndex][attributeIndex] < minWeight) {
                    minWeight = data[studentIndex][attributeIndex];
                }
            }
        }
        average = totalWeight / data.length;
        System.out.println("The lowest weight among five students: " + minWeight);
        System.out.println("The average weight and height of the five students: " + average);
        System.out.println("The name of the student with the oldest age among the five students: " + student + " with age " + maxAge + " years old");
    }
}
