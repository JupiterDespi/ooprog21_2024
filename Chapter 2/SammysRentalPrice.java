import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        final int RATE_PER_HOUR = 40;
        final int MINUTES_IN_HOUR = 60;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of minutes rented: ");
        int minutes = input.nextInt();

        int hoursRented = minutes / MINUTES_IN_HOUR;
        int extraMinutes = minutes % MINUTES_IN_HOUR;
        int totalCost = (hoursRented * RATE_PER_HOUR) + extraMinutes;

        System.out.println("************************************************");
        System.out.println("* Enjoy your time with Sammy's beach equipment *");
        System.out.println("************************************************");

        System.out.println("Hours rented: " + hoursRented);
        System.out.println("Additional minutes rented: " + extraMinutes);
        System.out.println("Total cost: $" + totalCost);
    }
}
