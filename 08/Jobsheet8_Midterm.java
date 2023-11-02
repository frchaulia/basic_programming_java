import java.util.Scanner;

public class Jobsheet8_Midterm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Departure time
        System.out.print("Enter hours of departure: ");
        int departureHours = input.nextInt();
        System.out.print("Enter minutes of departure: ");
        int departureMinutes = input.nextInt();
        System.out.print("Enter seconds of departure: ");
        int departureSeconds = input.nextInt();

        // Input: Arrival time
        System.out.print("Enter hours of arrival: ");
        int arrivalHours = input.nextInt();
        System.out.print("Enter minutes of arrival: ");
        int arrivalMinutes = input.nextInt();
        System.out.print("Enter seconds of arrival: ");
        int arrivalSeconds = input.nextInt();

        // Input: Rest period (optional)
        System.out.print("Do you need a rest period (yes or no)? ");
        String needRest = input.next();
        int restHours = 0;
        int restMinutes = 0;
        int restSeconds = 0;

        if (needRest.equalsIgnoreCase("yes")) {
            System.out.print("Enter hours of rest: ");
            restHours = input.nextInt();
            System.out.print("Enter minutes of rest: ");
            restMinutes = input.nextInt();
            System.out.print("Enter seconds of rest: ");
            restSeconds = input.nextInt();
        }

        // Calculate travel time
        int totalDepartureSeconds = departureHours * 3600 + departureMinutes * 60 + departureSeconds;
        int totalArrivalSeconds = arrivalHours * 3600 + arrivalMinutes * 60 + arrivalSeconds;
        int totalRestSeconds = restHours * 3600 + restMinutes * 60 + restSeconds;

        int travelTimeSeconds = totalArrivalSeconds - totalDepartureSeconds - totalRestSeconds;

        // Convert travel time to hours, minutes, and seconds
        int travelHours = travelTimeSeconds / 3600;
        int travelMinutes = (travelTimeSeconds % 3600) / 60;
        int travelSeconds = travelTimeSeconds % 60;

        // Output: Travel time
        System.out.println("Travel time: " + travelHours + " hours, " + travelMinutes + " minutes, " + travelSeconds + " seconds");

        input.close();
    }
}
