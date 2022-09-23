package nonComparisonSorting;

public class CountingSort {
    public static void main(String[] args) {
        int j = 0;
        int []arr = {1, 5, 2, 7, 1, 4, 2, 1, 0, 6, 8, 9, 5, 7, 10};
        int k = 11;
        int []count = new int[k];
        for (int value : arr) {
            count[value]++;
        }
        for (int i = 0; i < k; i++) {
            int n = count[i];
            while (n != 0) {
                arr[j++] = i;
                n--;
            }

        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
