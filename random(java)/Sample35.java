import java.util.Scanner;
public class Sample35 {
    



    // Recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: If only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth (largest) disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of disks
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        // Source = 'A', Destination = 'C', Auxiliary = 'B'
        System.out.println("\nSteps to solve Tower of Hanoi:");
        solveHanoi(n, 'A', 'C', 'B');

        // Display total number of moves
        System.out.println("\nTotal moves required: " + (int) (Math.pow(2, n) - 1));
    }
}
