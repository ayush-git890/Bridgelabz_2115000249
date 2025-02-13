import java.util.*;
class Pump {
    int petrol, distance;
    Pump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}
public class CircularTourProblem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();
        Pump[] arr = new Pump[n];
        System.out.println("Enter petrol and distance for each pump:");
        for (int i = 0; i < n; i++) {
            int petrol = sc.nextInt();
            int distance = sc.nextInt();
            arr[i] = new Pump(petrol, distance);
        }
        int start = initialPoint(arr, n);
        if (start == -1)
            System.out.println("No valid starting point found.");
        else
            System.out.println("Start at petrol pump index: " + start);
	}
	public static int initialPoint(Pump[] arr, int n) {
        int start = 0, flag = 0, bal = 0;
        for (int i = 0; i < n; i++) {
            bal += arr[i].petrol - arr[i].distance;
            if (bal < 0) {
                start = i + 1;
                flag += bal;
                bal = 0;
            }
        }

        return (bal + flag >= 0) ? start : -1;
    }
}