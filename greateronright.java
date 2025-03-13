public class greateronright {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 3, 4, 5, 2 };
        printGreaterElements(arr);
    }

    public static void printGreaterElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.println(max);
        }
    }
}