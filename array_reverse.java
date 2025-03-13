import java.util.Arrays;

public class array_reverse {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 3, 4, 5, 2 };
        System.out.println("Original array: " + Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}