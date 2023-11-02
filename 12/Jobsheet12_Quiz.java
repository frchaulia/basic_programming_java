import java.util.Scanner;

public class Jobsheet12_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = { "Rina", "Mia", "Ronny", "Fajri", "Risa", "Fatih" };
        int[][] scores = {
            {76, 75, 78, 87, 65},
            {90, 82, 45, 65, 77},
            {65, 56, 99, 55, 83},
            {23, 88, 35, 55, 92},
            {56, 45, 78, 78, 73},
            {88, 90, 90, 65, 60}
        };

        int numStudents = students.length;
        double[] finalGrades = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double taskScore = scores[i][0] * 0.3;
            double quizScore = scores[i][1] * 0.2;
            double midtermScore = scores[i][2] * 0.25;
            double finalexamScore = scores[i][3] * 0.25;

            double totalScore = taskScore + quizScore + midtermScore + finalexamScore;

            if (totalScore >= 81) {
                grades[i] = 'A';
            } else if (totalScore >= 61) {
                grades[i] = 'B';
            } else if (totalScore >= 41) {
                grades[i] = 'C';
            } else if (totalScore >= 21) {
                grades[i] = 'D';
            } else {
                grades[i] = 'E';
            }

            finalGrades[i] = totalScore;
        }

        // Display grades for each student
        System.out.println("Student Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i] + ": " + finalGrades[i] + " (" + grades[i] + ")");
        }

        // Find highest and lowest scorers
        double highestScore = finalGrades[0];
        double lowestScore = finalGrades[0];
        String highestScorer = students[0];
        String lowestScorer = students[0];

        for (int i = 1; i < numStudents; i++) {
            if (finalGrades[i] > highestScore) {
                highestScore = finalGrades[i];
                highestScorer = students[i];
            }
            if (finalGrades[i] < lowestScore) {
                lowestScore = finalGrades[i];
                lowestScorer = students[i];
            }
        }

        System.out.println("The highest scorer in mathematics courses: " + highestScorer + " with a score of " + highestScore);
        System.out.println("The lowest scorer in mathematics courses: " + lowestScorer + " with a score of " + lowestScore);
    }
}
