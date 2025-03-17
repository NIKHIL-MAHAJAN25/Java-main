import java.util.Arrays;

public class Selectionsort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.println("Step" + (i + 1) + ":" + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Unsorted array:" + Arrays.toString(arr));
        sort(arr);
        System.out.println("sorteed array" + Arrays.toString(arr));
    }
}
