public class largest_element{
    public static void main(String[] args) {
        // largest-element-in-an-array
        int arr[]={2,3,4,5,56,23,34};

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest: "+largest);
    }
}
