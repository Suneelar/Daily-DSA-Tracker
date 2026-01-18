public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 4, 1};
        int n = arr.length;
        int target = 4;
        Linear(arr, n, target);
    }

    static void Linear(int arr[], int n, int target) {
        boolean found = false; // flag to track if target is found

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                break; // exit loop once found
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
