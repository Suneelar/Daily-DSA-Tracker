import java.lang.reflect.Array;
import java.util.*;
public class twoSum {
    public static void main(String []args){
        int []arr={2,7,11,15};
        int target=9;
        twoSum s1=new twoSum();
        System.out.println(Arrays.toString(s1.twoSum(arr, target)));
        
    }
     public int[] twoSum(int[] arr, int target) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;i<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
     }
}
