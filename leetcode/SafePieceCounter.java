import java.util.Scanner;

public class SafePieceCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] grid = new String[8];  // 8x8 grid

        // Read the grid input
        for (int i = 0; i < 8; i++) {
            grid[i] = scanner.next();
        }

        // Arrays to mark if a row or column is unsafe
        boolean[] unsafeRows = new boolean[8];
        boolean[] unsafeCols = new boolean[8];

        // Mark rows and columns that contain a piece as unsafe
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (grid[i].charAt(j) == '#') {
                    unsafeRows[i] = true;
                    unsafeCols[j] = true;
                }
            }
        }

        // Count the safe empty squares
        int safeEmptyCount = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (grid[i].charAt(j) == '.' && !unsafeRows[i] && !unsafeCols[j]) {
                    safeEmptyCount++;
                }
            }
        }

        // Output the count of safe empty squares
        System.out.println(safeEmptyCount);
    }
}

