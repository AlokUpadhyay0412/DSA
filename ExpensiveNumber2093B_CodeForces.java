import java.util.*;
public class ExpensiveNumber2093B_CodeForces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(helper(arr[i]));
        }
    }
    private static int helper(String arr) {
        int res=0;
        int j=0;
        for(int i=arr.length()-1;i>=0;i--){
            if(arr.charAt(i)>'0'){
                j=i;
                break;
            }
            res++;
        }
        for(int i=0;i<j;i++){
            if(arr.charAt(i)>'0'){
                res++;
            }
        }
        return res;
    }
}
