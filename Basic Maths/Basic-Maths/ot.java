public class ot {
    public static void main(String[] args) {
        int count=0;
        int n=12345;
        while(n!=0){
            n=n%10;
            System.out.println(n);
            count=count+1;
            n=n/10;
            System.out.println(n);
        }
         
        System.out.println("hi"+count);
    }
}
