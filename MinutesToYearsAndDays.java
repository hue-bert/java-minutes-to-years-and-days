import java.util.Scanner;

public class MinutesToYearsAndDays {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes to be converted to years and days ");

        long minutes = scanner.nextLong();
        printYearsAndDays(minutes);

    }*/

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // years = 60 x 24 x 365 = 525600
            long years = minutes / 525600;
            long days = (minutes / 60 / 24) % 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
