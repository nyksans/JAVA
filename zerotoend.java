import java.util.Arrays;

public class zerotoend {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        int n = arr.length;
        int[] temp = new int[n];

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = j; i < n; i++) {
            temp[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}
