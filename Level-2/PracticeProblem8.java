import java.util.*;

public class PracticeProblem8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the traveler's name:");
        String name = sc.nextLine();
        System.out.println("Enter the starting city (fromCity):");
        String fromCity = sc.nextLine();
        System.out.println("Enter the via city (viaCity):");
        String viaCity = sc.nextLine();
        System.out.println("Enter the destination city (toCity):");
        String toCity = sc.nextLine();

        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " in miles:");
        double distanceFromToVia = sc.nextDouble();
        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles:");
        double distanceViaToFinalCity = sc.nextDouble();
        System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + " (hours minutes):");
        int hoursFromToVia = sc.nextInt();
        int minutesFromToVia = sc.nextInt();

        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;

        System.out.println("Enter the time taken from " + viaCity + " to " + toCity + " (hours minutes):");
        int hoursViaToFinalCity = sc.nextInt();
        int minutesViaToFinalCity = sc.nextInt();
        
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;

        // Calculate the total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity + 
                           " is " + totalDistance + " miles and " + 
                           "the Total Time taken is " + totalTime + " minutes");

        sc.close();
    }
}