import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {
        final int COST_PER_PERSON = 35;
        final int LARGE_EVENT_THRESHOLD = 50;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        int guests = sc.nextInt();

        int totalCost = guests * COST_PER_PERSON;
        boolean isLargeEvent = guests >= LARGE_EVENT_THRESHOLD;

        System.out.println("************************************************");
        System.out.println("* Carly’s makes the food that makes it a party! *");
        System.out.println("************************************************");

        System.out.println("Number of guests: " + guests);
        System.out.println("Price per guest: $" + COST_PER_PERSON);
        System.out.println("Total cost: $" + totalCost);
        System.out.println("Is this a large event? " + isLargeEvent);
    }
}
