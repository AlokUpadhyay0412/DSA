import java.util.*;
public class minimumNonZeroProductOfTheArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long res=minNonZeroProduct(n);
        System.out.println((int)res);
    }
    private static int minNonZeroProduct(int n) {
//        int m=(int) Math.pow(10,9)+7;
//        int y=(int) Math.pow(2,n)-2;
//        int mid=y/2;
//        int res=(int)Math.pow(y,mid);
//        res=res*(int)(Math.pow(2,n)-1);
//        return res;
        long m=(long)pow(10,9)+7;
        long max=((long)1<<n)-1;
        long res=(long)pow(max-1,(max-1)/2);
        res=(res%m)*(max%m);
        return (int)res;
    }
    private static long pow(long x, long y) {
        if(y==0)return 1;
        long res=pow(x,y/2);
        res=res*res;
        if(y%2==1)res=res*x;
        return res;
    }
}
