public class Move_Zeros {
    public static void main(String[] args) {
        // Move zeros to ends
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        // o/p: {1,2,3,2,4,5,1,0,0,0};
        int n=arr.length;
        optimal(arr,n);

        //print the loop
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void optimal(int arr[],int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

    }
}
