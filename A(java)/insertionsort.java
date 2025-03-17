class sort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }

    }

    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 23, 1, 10, 5, 2, 78, 54, 23, 45, 678, 989, 54, 23, 12, 23, 43, 12, 34, 56, 67, 54, 32, 38, 15, 56,
                78, 34, 43, 34, 323, 65, 67, 87, 54, 32 };
        sort insert = new sort();
        insert.sort(arr);
        insert.print(arr);
    }
}
