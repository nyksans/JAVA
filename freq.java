import java.util.Arrays;

public class freq {
    public static void main(String[] args) {
        int[] nums = new int[] { 16, 16, 3, 4, 4, 2, 3 };
        System.out.println("Array: " + Arrays.toString(nums));

        int[] freq = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (freq[i] == 1) {
                System.out.println("Element with frequency 1: " + nums[i]);
            }
        }

        System.out.println("Array: " + Arrays.toString(nums));
    }
}
