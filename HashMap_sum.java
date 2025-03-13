import java.util.Arrays;
import java.util.HashMap;

public class HashMap_sum {

    public static int[] findTwoSum_HashMap(int[] nums, int target) {
        HashMap<Integer, Integer> Map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (Map.containsKey(complement)) {
                return new int[] { Map.get(complement), i };
            }
            Map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 16, 17, 3, 4, 5, 2 };
        int target = 9;
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target sum: " + target);
        int[] result = findTwoSum_HashMap(nums, target);
        if (result.length == 2) {
            System.out.println("\nUsing HashMap method:");
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("\nUsing HashMap method: No solution found");
        }
    }
}