public class max_number {
    public static void main(String[] args){
        int []arr={12,23,45,67,89,12};
        int mmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mmax){
                mmax=arr[i];
            }
        }
        System.out.println("maxium: "+mmax);
    }
}
