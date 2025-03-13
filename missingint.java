public class missingint {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println("Missing number is: " + (i + 1));
                break;
            }
        }
    }

}
