import java.util.Scanner;
import java.util.Random;

public class QuickSort {
    static int count = 0;

    static int partition(int a[], int l, int r) {
        int pivot = a[l], temp, i = l, j = r + 1;
        while (true) {
            // Traverse i from left to right, segregating element of left group
            while (i < r && a[++i] <= pivot) {
                count++;
            }
            // Traverse j from right to left, segregating element of right group
            while (j > l && a[--j] >= pivot) {
                count++;
            }
            if (i >= j) {
                break;
            }
            // Swap a[i] and a[j]
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        // Swap a[l] and a[j]
        temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;
    }

    static void quicksort(int a[], int l, int r) {
        if (l < r) {
            // partition to place pivot element in between left and right group
            int s = partition(a, l, r);
            // partition to place pivot element in between left and right group
            quicksort(a, l, s - 1);
            quicksort(a, s + 1, r);
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        n = s.nextInt();
        int a[] = new int[n];
        Random r = new Random();
        // use random class object to generate random values
        System.out.println("input numbers are randomly generated");
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(10000);
        }
        s.close();

        quicksort(a, 0, n - 1);
        System.out.println("\n\nSorted numbers are");
        for (int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
        System.out.println("\n\nBest Case: " + (int) (n * Math.log(n) / Math.log(2)));
        System.out.println("\nNo. of basic operations: " + count);
        System.out.println("\nWorst Case: " + n * n);
    }
}
