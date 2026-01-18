public class LeftRoate_D_Places {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 2;
        // o/p:{3,4,5,6,7,1,2}
        basicsolutions(arr, d, n);
        // otimalapporach(arr, d, n);
        // print

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void basicsolutions(int arr[], int d, int n) {
        d = d % n;
        // temp i will store d place in temp
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        // to loop for 3 to 7
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // put back the element in the array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    static void otimalapporach(int arr[], int d, int n){
 d = d % n;
 reverse(arr,0,d-1);
 reverse(arr,d,n-1);
 reverse(arr,0,n-1);
    }
    static void  reverse(int []arr,int start,int end){
while(start<end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}
    }
}
