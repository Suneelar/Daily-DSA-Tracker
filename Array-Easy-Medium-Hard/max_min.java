public class max_min {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 56, 67 };
        maxArray(arr);

    }

    static void maxArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            } if (i < min) {
                min = i;
            }
        }
        System.out.println("Maxmium in the array: " + max);
        System.out.println("Minmium in the array: " + min);
    }
}
